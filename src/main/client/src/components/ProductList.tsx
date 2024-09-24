import { productService } from '@/services/product.service.ts';
import { useQuery } from '@tanstack/react-query';
import { FC } from 'react';
import { ProductCard } from './ProductCard';

const ProductList: FC = () => {
    const { data, error, isLoading } = useQuery({
        queryKey: ['products'],
        queryFn: productService.getProducts,
    });

    if (isLoading) {
        return <div>Loading...</div>;
    }

    if (error) {
        return <div>Error loading products</div>;
    }

    if (!data?.length) {
        return <div>No data</div>;
    }

    return (
        <div className='flex flex-col gap-4'>
            {data?.map((product: any, index: number) => <ProductCard product={product} key={index} />)}
        </div>
    );
};

export default ProductList;