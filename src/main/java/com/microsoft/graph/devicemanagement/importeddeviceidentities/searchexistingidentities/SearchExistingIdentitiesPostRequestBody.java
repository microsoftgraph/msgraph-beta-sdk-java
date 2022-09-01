package com.microsoft.graph.devicemanagement.importeddeviceidentities.searchexistingidentities;

import com.microsoft.graph.models.ImportedDeviceIdentity;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the searchExistingIdentities method. */
public class SearchExistingIdentitiesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The importedDeviceIdentities property */
    private java.util.List<ImportedDeviceIdentity> _importedDeviceIdentities;
    /**
     * Instantiates a new searchExistingIdentitiesPostRequestBody and sets the default values.
     * @return a void
     */
    public SearchExistingIdentitiesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchExistingIdentitiesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SearchExistingIdentitiesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchExistingIdentitiesPostRequestBody();
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
        final SearchExistingIdentitiesPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("importedDeviceIdentities", (n) -> { currentObject.setImportedDeviceIdentities(n.getCollectionOfObjectValues(ImportedDeviceIdentity::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the importedDeviceIdentities property value. The importedDeviceIdentities property
     * @return a importedDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedDeviceIdentity> getImportedDeviceIdentities() {
        return this._importedDeviceIdentities;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("importedDeviceIdentities", this.getImportedDeviceIdentities());
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
     * Sets the importedDeviceIdentities property value. The importedDeviceIdentities property
     * @param value Value to set for the importedDeviceIdentities property.
     * @return a void
     */
    public void setImportedDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedDeviceIdentity> value) {
        this._importedDeviceIdentities = value;
    }
}
