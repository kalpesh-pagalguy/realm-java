/*
 * Copyright 2014 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package examples.io.realm.realmignoreannotationsample.model;


import io.realm.RealmObject;
import io.realm.annotations.*;

@RealmClass
public class Book extends RealmObject {

    private String    title;
    private String    author;
    private Integer   ISBN;
    @Ignore private String nameOfBookShelf;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getShelfId() {
        return nameOfBookShelf;
    }

    public void setShelfId(String nameOfBookShelf) {
        this.nameOfBookShelf = nameOfBookShelf;
    }

}
