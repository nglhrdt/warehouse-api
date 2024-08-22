import { useEffect } from 'react';
import { Link } from 'react-router-dom';
import { env } from './env';
import Dictaphone from './components/Dictaphone';

function App() {
  useEffect(() => {
    fetch(`${env.API_BASE_URL}/health-check`)
      .then(response => response.text())
      .then(body => console.log(body));
  }, []);
  return (
    <div>
      <Link to='/cake'>Visit /cake</Link>
      <Dictaphone />
    </div>
  )
}

export default App
