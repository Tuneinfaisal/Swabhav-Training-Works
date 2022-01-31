var defaultName = "JavaScript";
function sayHello(name)
{
	if (name === undefined)
	{
		alert("Hello, " + defaultName + "!");
	}
	else
	{
		alert("Hello, " + name + "!");
	}
}