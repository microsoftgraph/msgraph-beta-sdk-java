package com.microsoft.graph.rolemanagement.directory.resourcenamespaces.item.importresourceactions;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the importResourceActions method. */
public class ImportResourceActionsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The format property */
    private String _format;
    /** The overwriteResourceNamespace property */
    private Boolean _overwriteResourceNamespace;
    /** The value property */
    private String _value;
    /**
     * Instantiates a new importResourceActionsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImportResourceActionsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importResourceActionsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ImportResourceActionsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportResourceActionsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ImportResourceActionsPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("format", (n) -> { currentObject.setFormat(n.getStringValue()); });
        deserializerMap.put("overwriteResourceNamespace", (n) -> { currentObject.setOverwriteResourceNamespace(n.getBooleanValue()); });
        deserializerMap.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The format property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFormat() {
        return this._format;
    }
    /**
     * Gets the overwriteResourceNamespace property value. The overwriteResourceNamespace property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOverwriteResourceNamespace() {
        return this._overwriteResourceNamespace;
    }
    /**
     * Gets the value property value. The value property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("format", this.getFormat());
        writer.writeBooleanValue("overwriteResourceNamespace", this.getOverwriteResourceNamespace());
        writer.writeStringValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the format property value. The format property
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final String value) {
        this._format = value;
    }
    /**
     * Sets the overwriteResourceNamespace property value. The overwriteResourceNamespace property
     * @param value Value to set for the overwriteResourceNamespace property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOverwriteResourceNamespace(@javax.annotation.Nullable final Boolean value) {
        this._overwriteResourceNamespace = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
}
