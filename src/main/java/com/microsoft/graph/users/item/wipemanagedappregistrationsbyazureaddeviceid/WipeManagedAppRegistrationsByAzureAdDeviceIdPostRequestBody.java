package com.microsoft.graph.users.item.wipemanagedappregistrationsbyazureaddeviceid;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the wipeManagedAppRegistrationsByAzureAdDeviceId method. */
public class WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The azureAdDeviceId property */
    private String _azureAdDeviceId;
    /**
     * Instantiates a new wipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody and sets the default values.
     * @return a void
     */
    public WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a wipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody
     */
    @javax.annotation.Nonnull
    public static WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody();
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
     * Gets the azureAdDeviceId property value. The azureAdDeviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this._azureAdDeviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("azureAdDeviceId", (n) -> { currentObject.setAzureAdDeviceId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("azureAdDeviceId", this.getAzureAdDeviceId());
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
     * Sets the azureAdDeviceId property value. The azureAdDeviceId property
     * @param value Value to set for the azureAdDeviceId property.
     * @return a void
     */
    public void setAzureAdDeviceId(@javax.annotation.Nullable final String value) {
        this._azureAdDeviceId = value;
    }
}
