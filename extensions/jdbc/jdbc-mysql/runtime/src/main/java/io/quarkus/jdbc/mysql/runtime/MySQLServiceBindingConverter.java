package io.quarkus.jdbc.mysql.runtime;

import java.util.List;
import java.util.Optional;

import io.quarkus.kubernetes.service.binding.runtime.JdbcDatasourceUtil;
import io.quarkus.kubernetes.service.binding.runtime.ServiceBinding;
import io.quarkus.kubernetes.service.binding.runtime.ServiceBindingConfigSource;
import io.quarkus.kubernetes.service.binding.runtime.ServiceBindingConverter;

public class MySQLServiceBindingConverter implements ServiceBindingConverter {

    @Override
    public Optional<ServiceBindingConfigSource> convert(List<ServiceBinding> serviceBindings) {
        return JdbcDatasourceUtil.convert(serviceBindings, "mysql");
    }
}
