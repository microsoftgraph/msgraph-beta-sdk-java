package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Note extends OutlookItem implements Parsable {
    /** The attachments property */
    private java.util.List<Attachment> _attachments;
    /** The body property */
    private ItemBody _body;
    /** The extensions property */
    private java.util.List<Extension> _extensions;
    /** The hasAttachments property */
    private Boolean _hasAttachments;
    /** The isDeleted property */
    private Boolean _isDeleted;
    /** The multiValueExtendedProperties property */
    private java.util.List<MultiValueLegacyExtendedProperty> _multiValueExtendedProperties;
    /** The singleValueExtendedProperties property */
    private java.util.List<SingleValueLegacyExtendedProperty> _singleValueExtendedProperties;
    /** The subject property */
    private String _subject;
    /**
     * Instantiates a new Note and sets the default values.
     * @return a void
     */
    public Note() {
        super();
        this.setOdataType("#microsoft.graph.note");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Note
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
        return this._attachments;
    }
    /**
     * Gets the body property value. The body property
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this._body;
    }
    /**
     * Gets the extensions property value. The extensions property
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Note currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("attachments", (n) -> { currentObject.setAttachments(n.getCollectionOfObjectValues(Attachment::createFromDiscriminatorValue)); });
            this.put("body", (n) -> { currentObject.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
            this.put("hasAttachments", (n) -> { currentObject.setHasAttachments(n.getBooleanValue()); });
            this.put("isDeleted", (n) -> { currentObject.setIsDeleted(n.getBooleanValue()); });
            this.put("multiValueExtendedProperties", (n) -> { currentObject.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("singleValueExtendedProperties", (n) -> { currentObject.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hasAttachments property value. The hasAttachments property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this._hasAttachments;
    }
    /**
     * Gets the isDeleted property value. The isDeleted property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeleted() {
        return this._isDeleted;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The multiValueExtendedProperties property
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this._multiValueExtendedProperties;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The singleValueExtendedProperties property
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this._singleValueExtendedProperties;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAttachments(@javax.annotation.Nullable final java.util.List<Attachment> value) {
        this._attachments = value;
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     * @return a void
     */
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this._body = value;
    }
    /**
     * Sets the extensions property value. The extensions property
     * @param value Value to set for the extensions property.
     * @return a void
     */
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the hasAttachments property value. The hasAttachments property
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this._hasAttachments = value;
    }
    /**
     * Sets the isDeleted property value. The isDeleted property
     * @param value Value to set for the isDeleted property.
     * @return a void
     */
    public void setIsDeleted(@javax.annotation.Nullable final Boolean value) {
        this._isDeleted = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The multiValueExtendedProperties property
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this._multiValueExtendedProperties = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The singleValueExtendedProperties property
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this._singleValueExtendedProperties = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
}
