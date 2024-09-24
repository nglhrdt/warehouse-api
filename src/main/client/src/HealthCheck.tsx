import { useQuery } from '@tanstack/react-query';
import { healthCheckService } from './services/health-check.service';

const HealthCheck = () => {
    useQuery({
        queryKey: ['health-check'],
        queryFn: () => healthCheckService.check().then(response => { console.log(response); return response; }),
        refetchInterval: 15000,
    });

    return null;
};

export default HealthCheck;