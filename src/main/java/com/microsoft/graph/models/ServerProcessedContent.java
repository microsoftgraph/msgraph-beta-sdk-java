package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServerProcessedContent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** A key-value map where keys are string identifiers and values are component ids. SharePoint servers might decide to use this hint to preload the script for corresponding components for performance boost. */
    private java.util.List<MetaDataKeyStringPair> componentDependencies;
    /** A key-value map where keys are string identifier and values are object of custom key-value pair. */
    private java.util.List<MetaDataKeyValuePair> customMetadata;
    /** A key-value map where keys are string identifiers and values are rich text with HTML format. SharePoint servers treat the values as HTML content and run services like safety checks, search index and link fixup on them. */
    private java.util.List<MetaDataKeyStringPair> htmlStrings;
    /** A key-value map where keys are string identifiers and values are image sources. SharePoint servers treat the values as image sources and run services like search index and link fixup on them. */
    private java.util.List<MetaDataKeyStringPair> imageSources;
    /** A key-value map where keys are string identifiers and values are links. SharePoint servers treat the values as links and run services like link fixup on them. */
    private java.util.List<MetaDataKeyStringPair> links;
    /** The OdataType property */
    private String odataType;
    /** A key-value map where keys are string identifiers and values are strings that should be search indexed. */
    private java.util.List<MetaDataKeyStringPair> searchablePlainTexts;
    /**
     * Instantiates a new serverProcessedContent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServerProcessedContent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serverProcessedContent
     */
    @javax.annotation.Nonnull
    public static ServerProcessedContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServerProcessedContent();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the componentDependencies property value. A key-value map where keys are string identifiers and values are component ids. SharePoint servers might decide to use this hint to preload the script for corresponding components for performance boost.
     * @return a metaDataKeyStringPair
     */
    @javax.annotation.Nullable
    public java.util.List<MetaDataKeyStringPair> getComponentDependencies() {
        return this.componentDependencies;
    }
    /**
     * Gets the customMetadata property value. A key-value map where keys are string identifier and values are object of custom key-value pair.
     * @return a metaDataKeyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<MetaDataKeyValuePair> getCustomMetadata() {
        return this.customMetadata;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("componentDependencies", (n) -> { this.setComponentDependencies(n.getCollectionOfObjectValues(MetaDataKeyStringPair::createFromDiscriminatorValue)); });
        deserializerMap.put("customMetadata", (n) -> { this.setCustomMetadata(n.getCollectionOfObjectValues(MetaDataKeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("htmlStrings", (n) -> { this.setHtmlStrings(n.getCollectionOfObjectValues(MetaDataKeyStringPair::createFromDiscriminatorValue)); });
        deserializerMap.put("imageSources", (n) -> { this.setImageSources(n.getCollectionOfObjectValues(MetaDataKeyStringPair::createFromDiscriminatorValue)); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getCollectionOfObjectValues(MetaDataKeyStringPair::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("searchablePlainTexts", (n) -> { this.setSearchablePlainTexts(n.getCollectionOfObjectValues(MetaDataKeyStringPair::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the htmlStrings property value. A key-value map where keys are string identifiers and values are rich text with HTML format. SharePoint servers treat the values as HTML content and run services like safety checks, search index and link fixup on them.
     * @return a metaDataKeyStringPair
     */
    @javax.annotation.Nullable
    public java.util.List<MetaDataKeyStringPair> getHtmlStrings() {
        return this.htmlStrings;
    }
    /**
     * Gets the imageSources property value. A key-value map where keys are string identifiers and values are image sources. SharePoint servers treat the values as image sources and run services like search index and link fixup on them.
     * @return a metaDataKeyStringPair
     */
    @javax.annotation.Nullable
    public java.util.List<MetaDataKeyStringPair> getImageSources() {
        return this.imageSources;
    }
    /**
     * Gets the links property value. A key-value map where keys are string identifiers and values are links. SharePoint servers treat the values as links and run services like link fixup on them.
     * @return a metaDataKeyStringPair
     */
    @javax.annotation.Nullable
    public java.util.List<MetaDataKeyStringPair> getLinks() {
        return this.links;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the searchablePlainTexts property value. A key-value map where keys are string identifiers and values are strings that should be search indexed.
     * @return a metaDataKeyStringPair
     */
    @javax.annotation.Nullable
    public java.util.List<MetaDataKeyStringPair> getSearchablePlainTexts() {
        return this.searchablePlainTexts;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("componentDependencies", this.getComponentDependencies());
        writer.writeCollectionOfObjectValues("customMetadata", this.getCustomMetadata());
        writer.writeCollectionOfObjectValues("htmlStrings", this.getHtmlStrings());
        writer.writeCollectionOfObjectValues("imageSources", this.getImageSources());
        writer.writeCollectionOfObjectValues("links", this.getLinks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("searchablePlainTexts", this.getSearchablePlainTexts());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the componentDependencies property value. A key-value map where keys are string identifiers and values are component ids. SharePoint servers might decide to use this hint to preload the script for corresponding components for performance boost.
     * @param value Value to set for the componentDependencies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComponentDependencies(@javax.annotation.Nullable final java.util.List<MetaDataKeyStringPair> value) {
        this.componentDependencies = value;
    }
    /**
     * Sets the customMetadata property value. A key-value map where keys are string identifier and values are object of custom key-value pair.
     * @param value Value to set for the customMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomMetadata(@javax.annotation.Nullable final java.util.List<MetaDataKeyValuePair> value) {
        this.customMetadata = value;
    }
    /**
     * Sets the htmlStrings property value. A key-value map where keys are string identifiers and values are rich text with HTML format. SharePoint servers treat the values as HTML content and run services like safety checks, search index and link fixup on them.
     * @param value Value to set for the htmlStrings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHtmlStrings(@javax.annotation.Nullable final java.util.List<MetaDataKeyStringPair> value) {
        this.htmlStrings = value;
    }
    /**
     * Sets the imageSources property value. A key-value map where keys are string identifiers and values are image sources. SharePoint servers treat the values as image sources and run services like search index and link fixup on them.
     * @param value Value to set for the imageSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageSources(@javax.annotation.Nullable final java.util.List<MetaDataKeyStringPair> value) {
        this.imageSources = value;
    }
    /**
     * Sets the links property value. A key-value map where keys are string identifiers and values are links. SharePoint servers treat the values as links and run services like link fixup on them.
     * @param value Value to set for the links property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLinks(@javax.annotation.Nullable final java.util.List<MetaDataKeyStringPair> value) {
        this.links = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the searchablePlainTexts property value. A key-value map where keys are string identifiers and values are strings that should be search indexed.
     * @param value Value to set for the searchablePlainTexts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchablePlainTexts(@javax.annotation.Nullable final java.util.List<MetaDataKeyStringPair> value) {
        this.searchablePlainTexts = value;
    }
}
