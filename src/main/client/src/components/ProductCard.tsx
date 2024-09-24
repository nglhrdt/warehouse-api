import { Card, CardContent, CardDescription, CardFooter, CardHeader, CardTitle } from "@/components/ui/card";
import { FC } from "react";

type ProductCardProps = {
    product: any;
}

export const ProductCard: FC<ProductCardProps> = ([product]) => {
    return <Card>
        <CardHeader>
            <CardTitle>Card Title</CardTitle>
            <CardDescription>Card Description</CardDescription>
        </CardHeader>
        <CardContent>
            <p>Card Content</p>
        </CardContent>
        <CardFooter>
            <p>{JSON.stringify(product)}</p>
        </CardFooter>
    </Card>
}