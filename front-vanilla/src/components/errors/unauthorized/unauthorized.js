import {messages} from "../messages.js";
import unauthorized from unauthorized.css;

function renderUnauthorized() {
    const content =
   ` <h1>{messages.errors.unauthorizerd.h1}</h1>
   <p>{messages.errors.unauthorizerd.p}</p>
     <img class="error-image" src="../../../assets/unauthorizedError.png" alt="401 unauthorized">
    `
    const main = document.getElementById("main");
    main.innerHTML = content;
    
};
export {renderUnauthorized};