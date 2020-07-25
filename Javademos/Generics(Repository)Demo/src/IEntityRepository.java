public interface IEntityRepository<T extends IEntity> {
    //T extends IEntity yazarak generic constraints uyguladık sadece IEntity i implement eden classlar 'T' yerine geçebilir
//örneğin void add(Validator entity) yazamazdık çünkü Validator class ı IEntity i implements etmiyor
    void add(T entity);
    void delete(T entity);
    void update(T entity);

}
