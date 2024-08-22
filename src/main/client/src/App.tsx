import { useEffect } from 'react';
import { Link } from 'react-router-dom';
import { env } from './env';

function App() {
  useEffect(() => {
    fetch(`${env.API_BASE_URL}/health-check`)
      .then(response => response.text())
      .then(body => console.log(body));
  }, []);
  return <Link to='/cake'>Visit /cake</Link>
}

export default App
