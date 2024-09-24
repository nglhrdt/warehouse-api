import Dictaphone from './components/Dictaphone';
import ProductList from './components/ProductList';

function App() {
  return (
    <div className="flex flex-col gap-4"> 
      <h1 className="text-3xl font-bold underline">
        Hello world!
      </h1>
      <ProductList />
      <Dictaphone />
    </div>
  )
}

export default App
