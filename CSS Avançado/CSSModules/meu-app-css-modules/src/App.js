import logo from './logo.svg';
import estilo from './App.module.css';
import novoEstilo from './NovoCss.module.css';



function App() {
  return (
    <div className={estilo.App}>
      <header className={novoEstilo['App-header']}>
        <img src={logo} className={estilo['App-logo']} alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className={estilo['App-link']}
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
