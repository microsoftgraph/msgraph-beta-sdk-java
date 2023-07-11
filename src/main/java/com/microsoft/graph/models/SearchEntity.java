package com.microsoft.graph.models;

import com.microsoft.graph.models.search.Acronym;
import com.microsoft.graph.models.search.Bookmark;
import com.microsoft.graph.models.search.Qna;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchEntity extends Entity implements Parsable {
    /**
     * Administrative answer in Microsoft Search results to define common acronyms in a organization.
     */
    private java.util.List<Acronym> acronyms;
    /**
     * Administrative answer in Microsoft Search results for common search queries in an organization.
     */
    private java.util.List<Bookmark> bookmarks;
    /**
     * Administrative answer in Microsoft Search results which provide answers for specific search keywords in an organization.
     */
    private java.util.List<Qna> qnas;
    /**
     * Instantiates a new searchEntity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SearchEntity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchEntity
     */
    @javax.annotation.Nonnull
    public static SearchEntity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchEntity();
    }
    /**
     * Gets the acronyms property value. Administrative answer in Microsoft Search results to define common acronyms in a organization.
     * @return a acronym
     */
    @javax.annotation.Nullable
    public java.util.List<Acronym> getAcronyms() {
        return this.acronyms;
    }
    /**
     * Gets the bookmarks property value. Administrative answer in Microsoft Search results for common search queries in an organization.
     * @return a bookmark
     */
    @javax.annotation.Nullable
    public java.util.List<Bookmark> getBookmarks() {
        return this.bookmarks;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acronyms", (n) -> { this.setAcronyms(n.getCollectionOfObjectValues(Acronym::createFromDiscriminatorValue)); });
        deserializerMap.put("bookmarks", (n) -> { this.setBookmarks(n.getCollectionOfObjectValues(Bookmark::createFromDiscriminatorValue)); });
        deserializerMap.put("qnas", (n) -> { this.setQnas(n.getCollectionOfObjectValues(Qna::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the qnas property value. Administrative answer in Microsoft Search results which provide answers for specific search keywords in an organization.
     * @return a qna
     */
    @javax.annotation.Nullable
    public java.util.List<Qna> getQnas() {
        return this.qnas;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acronyms", this.getAcronyms());
        writer.writeCollectionOfObjectValues("bookmarks", this.getBookmarks());
        writer.writeCollectionOfObjectValues("qnas", this.getQnas());
    }
    /**
     * Sets the acronyms property value. Administrative answer in Microsoft Search results to define common acronyms in a organization.
     * @param value Value to set for the acronyms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcronyms(@javax.annotation.Nullable final java.util.List<Acronym> value) {
        this.acronyms = value;
    }
    /**
     * Sets the bookmarks property value. Administrative answer in Microsoft Search results for common search queries in an organization.
     * @param value Value to set for the bookmarks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBookmarks(@javax.annotation.Nullable final java.util.List<Bookmark> value) {
        this.bookmarks = value;
    }
    /**
     * Sets the qnas property value. Administrative answer in Microsoft Search results which provide answers for specific search keywords in an organization.
     * @param value Value to set for the qnas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQnas(@javax.annotation.Nullable final java.util.List<Qna> value) {
        this.qnas = value;
    }
}
