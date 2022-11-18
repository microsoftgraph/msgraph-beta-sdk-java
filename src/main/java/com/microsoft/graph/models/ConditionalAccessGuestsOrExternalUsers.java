package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessGuestsOrExternalUsers implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The tenant ids of the selected types of external users. It could be either all b2b tenant, or a collection of tenant ids. External tenants can be specified only when guestOrExternalUserTypes is not null or an empty string. */
    private ConditionalAccessExternalTenants _externalTenants;
    /** The guestOrExternalUserTypes property */
    private ConditionalAccessGuestOrExternalUserTypes _guestOrExternalUserTypes;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new conditionalAccessGuestsOrExternalUsers and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessGuestsOrExternalUsers() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.conditionalAccessGuestsOrExternalUsers");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessGuestsOrExternalUsers
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessGuestsOrExternalUsers createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessGuestsOrExternalUsers();
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
     * Gets the externalTenants property value. The tenant ids of the selected types of external users. It could be either all b2b tenant, or a collection of tenant ids. External tenants can be specified only when guestOrExternalUserTypes is not null or an empty string.
     * @return a conditionalAccessExternalTenants
     */
    @javax.annotation.Nullable
    public ConditionalAccessExternalTenants getExternalTenants() {
        return this._externalTenants;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessGuestsOrExternalUsers currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("externalTenants", (n) -> { currentObject.setExternalTenants(n.getObjectValue(ConditionalAccessExternalTenants::createFromDiscriminatorValue)); });
            this.put("guestOrExternalUserTypes", (n) -> { currentObject.setGuestOrExternalUserTypes(n.getEnumValue(ConditionalAccessGuestOrExternalUserTypes.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the guestOrExternalUserTypes property value. The guestOrExternalUserTypes property
     * @return a conditionalAccessGuestOrExternalUserTypes
     */
    @javax.annotation.Nullable
    public ConditionalAccessGuestOrExternalUserTypes getGuestOrExternalUserTypes() {
        return this._guestOrExternalUserTypes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("externalTenants", this.getExternalTenants());
        writer.writeEnumValue("guestOrExternalUserTypes", this.getGuestOrExternalUserTypes());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the externalTenants property value. The tenant ids of the selected types of external users. It could be either all b2b tenant, or a collection of tenant ids. External tenants can be specified only when guestOrExternalUserTypes is not null or an empty string.
     * @param value Value to set for the externalTenants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalTenants(@javax.annotation.Nullable final ConditionalAccessExternalTenants value) {
        this._externalTenants = value;
    }
    /**
     * Sets the guestOrExternalUserTypes property value. The guestOrExternalUserTypes property
     * @param value Value to set for the guestOrExternalUserTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGuestOrExternalUserTypes(@javax.annotation.Nullable final ConditionalAccessGuestOrExternalUserTypes value) {
        this._guestOrExternalUserTypes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
