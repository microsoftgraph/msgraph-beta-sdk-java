package com.microsoft.graph.devicemanagement.deponboardingsettings.item.importedappledeviceidentities.importappledeviceidentitylist;

import com.microsoft.graph.models.ImportedAppleDeviceIdentity;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the importAppleDeviceIdentityList method. */
public class ImportAppleDeviceIdentityListPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The importedAppleDeviceIdentities property */
    private java.util.List<ImportedAppleDeviceIdentity> _importedAppleDeviceIdentities;
    /** The overwriteImportedDeviceIdentities property */
    private Boolean _overwriteImportedDeviceIdentities;
    /**
     * Instantiates a new importAppleDeviceIdentityListPostRequestBody and sets the default values.
     * @return a void
     */
    public ImportAppleDeviceIdentityListPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importAppleDeviceIdentityListPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ImportAppleDeviceIdentityListPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportAppleDeviceIdentityListPostRequestBody();
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
        final ImportAppleDeviceIdentityListPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("importedAppleDeviceIdentities", (n) -> { currentObject.setImportedAppleDeviceIdentities(n.getCollectionOfObjectValues(ImportedAppleDeviceIdentity::createFromDiscriminatorValue)); });
            this.put("overwriteImportedDeviceIdentities", (n) -> { currentObject.setOverwriteImportedDeviceIdentities(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the importedAppleDeviceIdentities property value. The importedAppleDeviceIdentities property
     * @return a importedAppleDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedAppleDeviceIdentity> getImportedAppleDeviceIdentities() {
        return this._importedAppleDeviceIdentities;
    }
    /**
     * Gets the overwriteImportedDeviceIdentities property value. The overwriteImportedDeviceIdentities property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOverwriteImportedDeviceIdentities() {
        return this._overwriteImportedDeviceIdentities;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("importedAppleDeviceIdentities", this.getImportedAppleDeviceIdentities());
        writer.writeBooleanValue("overwriteImportedDeviceIdentities", this.getOverwriteImportedDeviceIdentities());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the importedAppleDeviceIdentities property value. The importedAppleDeviceIdentities property
     * @param value Value to set for the importedAppleDeviceIdentities property.
     * @return a void
     */
    public void setImportedAppleDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedAppleDeviceIdentity> value) {
        this._importedAppleDeviceIdentities = value;
    }
    /**
     * Sets the overwriteImportedDeviceIdentities property value. The overwriteImportedDeviceIdentities property
     * @param value Value to set for the overwriteImportedDeviceIdentities property.
     * @return a void
     */
    public void setOverwriteImportedDeviceIdentities(@javax.annotation.Nullable final Boolean value) {
        this._overwriteImportedDeviceIdentities = value;
    }
}
