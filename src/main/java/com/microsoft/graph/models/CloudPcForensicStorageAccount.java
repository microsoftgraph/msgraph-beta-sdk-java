package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcForensicStorageAccount extends Entity implements Parsable {
    /** The ID of the storage account. */
    private String _storageAccountId;
    /** The name of the storage account. */
    private String _storageAccountName;
    /**
     * Instantiates a new cloudPcForensicStorageAccount and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcForensicStorageAccount() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcForensicStorageAccount");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcForensicStorageAccount
     */
    @javax.annotation.Nonnull
    public static CloudPcForensicStorageAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcForensicStorageAccount();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcForensicStorageAccount currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("storageAccountId", (n) -> { currentObject.setStorageAccountId(n.getStringValue()); });
        deserializerMap.put("storageAccountName", (n) -> { currentObject.setStorageAccountName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the storageAccountId property value. The ID of the storage account.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStorageAccountId() {
        return this._storageAccountId;
    }
    /**
     * Gets the storageAccountName property value. The name of the storage account.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStorageAccountName() {
        return this._storageAccountName;
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
        writer.writeStringValue("storageAccountId", this.getStorageAccountId());
        writer.writeStringValue("storageAccountName", this.getStorageAccountName());
    }
    /**
     * Sets the storageAccountId property value. The ID of the storage account.
     * @param value Value to set for the storageAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageAccountId(@javax.annotation.Nullable final String value) {
        this._storageAccountId = value;
    }
    /**
     * Sets the storageAccountName property value. The name of the storage account.
     * @param value Value to set for the storageAccountName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageAccountName(@javax.annotation.Nullable final String value) {
        this._storageAccountName = value;
    }
}
