import { Route, Switch } from 'react-router-dom';
import { BrowserRouter, Redirect } from 'react-router-dom/cjs/react-router-dom.min';
import './App.css';
import Header from './components/Header';
import Home from './Pages/Home';
import About from './Pages/About';
import Profile from './Pages/Profile';
import NotFound from './Pages/NotFound';
import Post from './Pages/Post';
import { useState } from 'react';

function App() {

  const [login, setLogin] = useState(false);

  return (
    <BrowserRouter >
      <div className="App">
        <Header></Header>

        <button onClick={() => setLogin(!login)}>{login ? "Logout" : "Login"}</button>

        <Switch>
          <Route exact path='/' component={Home} />
          <Route path='/about' component={About} />
          {/* <Route path='/profile'>
            {login? <Profile/> : <Redirect to="/"/>}
          </Route> */}
          <Route path='/profile'>
            <Profile login={login}/>
          </Route>
          <Route path='/post/:id' component={Post} />
          <Route component={NotFound} />
        </Switch>
      </div>

    </BrowserRouter>
  );
}

export default App;
