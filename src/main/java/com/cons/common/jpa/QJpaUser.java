package com.cons.common.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QJpaUser is a Querydsl query type for JpaUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJpaUser extends EntityPathBase<JpaUser> {

    private static final long serialVersionUID = -2130662400L;

    public static final QJpaUser jpaUser = new QJpaUser("jpaUser");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> num = createNumber("num", Integer.class);

    public QJpaUser(String variable) {
        super(JpaUser.class, forVariable(variable));
    }

    public QJpaUser(Path<? extends JpaUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaUser(PathMetadata metadata) {
        super(JpaUser.class, metadata);
    }

}

