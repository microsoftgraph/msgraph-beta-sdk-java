package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RenameAction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The new name of the item.
     */
    private String newName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The previous name of the item.
     */
    private String oldName;
    /**
     * Instantiates a new renameAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RenameAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a renameAction
     */
    @javax.annotation.Nonnull
    public static RenameAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RenameAction();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("newName", (n) -> { this.setNewName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("oldName", (n) -> { this.setOldName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newName property value. The new name of the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewName() {
        return this.newName;
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
     * Gets the oldName property value. The previous name of the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldName() {
        return this.oldName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("newName", this.getNewName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("oldName", this.getOldName());
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
     * Sets the newName property value. The new name of the item.
     * @param value Value to set for the newName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewName(@javax.annotation.Nullable final String value) {
        this.newName = value;
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
     * Sets the oldName property value. The previous name of the item.
     * @param value Value to set for the oldName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOldName(@javax.annotation.Nullable final String value) {
        this.oldName = value;
    }
}
