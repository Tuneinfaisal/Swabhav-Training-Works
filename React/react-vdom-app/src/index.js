import React from "react";
import ReactDOM from "react-dom";

const refresh = () => {
    //html(root1)
    document.getElementById("root1").innerHTML = `
    <div>
        Hello from Html
        <input/>
            <pre>${new Date().toLocaleString()} </pre>
    </div>
    
    `;
    //root(root2)
    const stringContent = "Hello from react";
    const textBox = React.createElement("input", null);
    const preText = React.createElement(
        "pre",
        null,
        new Date().toLocaleTimeString()
    );

    const reactRootElement = React.createElement(
        "div",
        { title: " this is div" },
        stringContent,
        textBox,
        preText
    );

    ReactDOM.render(reactRootElement, document.getElementById("root2"));
};
setInterval(() => {
    refresh();
}, 1000);
