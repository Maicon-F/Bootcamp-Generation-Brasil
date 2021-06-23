let nome = window.document.getElementById('nome')
let email = document.querySelector('#email');
let assunto = document.querySelector('#assunto')
let nomeOk = false
let emailOk = false
let assuntoOk = false

nome.style.width = '100%'
email.style.width = '100%'

function validateName() {
    let txt = document.querySelector('#txtNome')
    if (nome.value.length < 3) {
        txt.innerHTML = 'Invalid input!'
        txt.style.color = 'red'
    }
    else {
        txt.innerHTML = ''
        nomeOK = true
    }
}


function validateEmail() {
    let txt = document.querySelector('#txtEmail')
    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        txt.innerHTML = 'Invalid input! Please, check your insertion.'
        txt.style.color = 'red'
    }
    else {
        txt.innerHTML = ''
        emailOk = true
    }
}

function validateDescription() {
    let txt = document.querySelector('#txtAssunto')
    if (assunto.value.length < 10 || assunto.value.length > 100) {
        txt.innerHTML = 'Invalid input! Please, write a text between 10 and 100 words.'
        txt.style.color = 'red'
    }
    else {
        txt.innerHTML = ''
        assuntoOk = true
    }
}

function send() {
    if (nomeOk == true && emailOk == true && assuntoOk == true) {
        alert('Message has been sent! Thank you for contacting us!')
    }
    else {
        alert('Please, fill the form correctly.')
    }
}