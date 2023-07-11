package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Note extends OutlookItem implements Parsable {
    /**
     * The attachments property
     */
    private java.util.List<Attachment> attachments;
    /**
     * The body property
     */
    private ItemBody body;
    /**
     * The extensions property
     */
    private java.util.List<Extension> extensions;
    /**
     * The hasAttachments property
     */
    private Boolean hasAttachments;
    /**
     * The isDeleted property
     */
    private Boolean isDeleted;
    /**
     * The multiValueExtendedProperties property
     */
    private java.util.List<MultiValueLegacyExtendedProperty> multiValueExtendedProperties;
    /**
     * The singleValueExtendedProperties property
     */
    private java.util.List<SingleValueLegacyExtendedProperty> singleValueExtendedProperties;
    /**
     * The subject property
     */
    private String subject;
    /**
     * Instantiates a new note and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Note() {
        super();
        this.setOdataType("#microsoft.graph.note");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a note
     */
    @javax.annotation.Nonnull
    public static Note createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Note();
    }
    /**
     * Gets the attachments property value. The attachments property
     * @return a attachment
     */
    @javax.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }
    /**
     * Gets the body property value. The body property
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this.body;
    }
    /**
     * Gets the extensions property value. The extensions property
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(Attachment::createFromDiscriminatorValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("isDeleted", (n) -> { this.setIsDeleted(n.getBooleanValue()); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasAttachments property value. The hasAttachments property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.hasAttachments;
    }
    /**
     * Gets the isDeleted property value. The isDeleted property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The multiValueExtendedProperties property
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The singleValueExtendedProperties property
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
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
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeObjectValue("body", this.getBody());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the attachments property value. The attachments property
     * @param value Value to set for the attachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachments(@javax.annotation.Nullable final java.util.List<Attachment> value) {
        this.attachments = value;
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this.body = value;
    }
    /**
     * Sets the extensions property value. The extensions property
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this.extensions = value;
    }
    /**
     * Sets the hasAttachments property value. The hasAttachments property
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this.hasAttachments = value;
    }
    /**
     * Sets the isDeleted property value. The isDeleted property
     * @param value Value to set for the isDeleted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDeleted(@javax.annotation.Nullable final Boolean value) {
        this.isDeleted = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The multiValueExtendedProperties property
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.multiValueExtendedProperties = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The singleValueExtendedProperties property
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.singleValueExtendedProperties = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
    }
}
