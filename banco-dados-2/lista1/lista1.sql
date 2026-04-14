6select				2
3 join				1
1 order by limit		


-- qtd de população por centro regional de saude de regionais que tenham a média populacional por cidade acima de 100k
select  sum(p.population),  p.health_region_code, p.health_region, count(*) cidades_na_regional
from brazil_covid_19_cities as c
group by p.health_region_code, p.health_region
having (sum(p.population) / count(*)) > 100000 


--codigo cidade, qtd max de casos, qtd população
select c.code, max(c.cases), p.population
from brazil_covid_19_cities as c
	inner join brazil_population_2019 as p on c.code = p.city_code
group by c.code

-- CIDADE, POPULAÇÃO, LATITUDE/LONGITUDE
select cc.name, pop.population, cc.lat, cc.long,
from brazil_cities_cordenates as cc
	inner join brazil_population_2019 as pop on cc.city_code = pop.city-code