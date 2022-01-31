function login()
{
    var uname = document.getElementById("name").value;
    var password = document.getElementById("password").value;
    if (uname == '')
    {
        alert("Enter name.");
    }
    else if (password == '')
    {
        alert("Enter password");
    }
    else if (password.length < 5)
    {
        alert("Password minimum length is 5.");
    }
    else
    {
        alert("You are successfully logged in");
    }
    reset();
}

function reset()
{
    document.getElementById("name").value = "";
    document.getElementById("password").value = "";
}