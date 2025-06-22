function validaForm(evt){
  evt.preventDefault();
  let nome = document.getElementById('nome');
  let email = document.getElementById('email');
  let telefone = document.getElementById('telefone');
  let mensagem = document.getElementById('mensagem');

  document.querySelectorAll('[temp="1"]').forEach(elm => {
    elm.remove()
  })
  
  feedbacks = {
    nome :['Muito Bem', 'Por favor Insira o nome completo'],
    email:['Belo Email', 'Favor Inserir um email de válido'],
    telefone: ['Legal, já posso te ligar de madrugada', 'Nem vou te mandar spam, juro...'],
    mensagem: ['Muito Obrigado pela sua mensagem', 'Sério mesmo que vc não vai escrever nada ??']
  }

  let nomeIsValid = !!(nome.value && nome.value.split(' ').length > 1)
  let emailIsValid = !!(email.value)
  let telefoneIsValid = !!(telefone.value)
  let mensagemIsValid = !!(mensagem.value.trim())

  mostraFeedBack(nome, nomeIsValid, feedbacks.nome)
  mostraFeedBack(email, emailIsValid, feedbacks.email)
  mostraFeedBack(telefone, telefoneIsValid, feedbacks.telefone)
  mostraFeedBack(mensagem, mensagemIsValid, feedbacks.mensagem)

  
  // const myModal = new bootstrap.Modal(document.getElementById('exampleModal'), options)
  // or
  
  if(nomeIsValid && emailIsValid && telefoneIsValid && mensagemIsValid){
    new bootstrap.Modal('#respostaForm').show()
  }
  
  return false;
}

function mostraFeedBack(elmPai, isValid, messages){

  parentClass = ['is-valid', 'is-invalid']
  feedbackClass = ['valid-feedback', 'invalid-feedback']
  
  elmPai.classList.remove(...parentClass)

  const div = document.createElement('div')
  div.setAttribute('temp', 1)
  const index = isValid ? 0 : 1

  elmPai.classList.add(parentClass[index])
  div.classList.add(feedbackClass[index])
  div.textContent = messages[index]
  elmPai.after(div)
}