# project-jasypt-demo

##Comandos utilizados para criptografar senha:
- mvn jasypt:encrypt-value   -Djasypt.encryptor.password=master-key-123   -Djasypt.plugin.value=real_password_456
- mvn jasypt:encrypt-value   -Djasypt.encryptor.password=master-key-123   -Djasypt.plugin.value=123456-internal

#Dependecia e plugin no pom.xml
<img width="465" height="92" alt="image" src="https://github.com/user-attachments/assets/af753228-42ff-412f-8fbd-6d3416fdb3f7" />
<img width="376" height="87" alt="image" src="https://github.com/user-attachments/assets/a5db0555-9244-4590-b42b-8962d653e0ce" />

##Docker Compose e DOcker file
- Após gerar senha cole em seus repectivos campos dentro da função ENC()
<img width="898" height="380" alt="image" src="https://github.com/user-attachments/assets/d0eb3dde-ebf7-4696-8fd5-0f5d45d36b05" />
<img width="907" height="252" alt="image" src="https://github.com/user-attachments/assets/df48df6a-424d-4837-9067-f8563cc7c82f" />

##application.properties
- Atributos necessários
<img width="620" height="336" alt="image" src="https://github.com/user-attachments/assets/a2d7d6ed-883b-4573-a295-5ac443e39d7c" />

##Java applciation
- Annotation necessário
<img width="571" height="232" alt="image" src="https://github.com/user-attachments/assets/a43e47cb-7a15-4caa-9dec-855a888491f1" />
