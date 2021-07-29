package com.cons.common.Querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QQuerydslTest is a Querydsl query type for QuerydslTest
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QQuerydslTest extends EntityPathBase<QuerydslTest> {

    private static final long serialVersionUID = 1259615277L;

    public static final QQuerydslTest querydslTest = new QQuerydslTest("querydslTest");

    public final NumberPath<Long> Id = createNumber("Id", Long.class);

    public final StringPath name = createString("name");

    public QQuerydslTest(String variable) {
        super(QuerydslTest.class, forVariable(variable));
    }

    public QQuerydslTest(Path<? extends QuerydslTest> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQuerydslTest(PathMetadata metadata) {
        super(QuerydslTest.class, metadata);
    }

}

