package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserRegistrationCount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Provides the registration count for your tenant.
     */
    private Long registrationCount;
    /**
     * The registrationStatus property
     */
    private RegistrationStatusType registrationStatus;
    /**
     * Instantiates a new UserRegistrationCount and sets the default values.
     */
    public UserRegistrationCount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserRegistrationCount
     */
    @jakarta.annotation.Nonnull
    public static UserRegistrationCount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationCount();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("registrationCount", (n) -> { this.setRegistrationCount(n.getLongValue()); });
        deserializerMap.put("registrationStatus", (n) -> { this.setRegistrationStatus(n.getEnumValue(RegistrationStatusType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the registrationCount property value. Provides the registration count for your tenant.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getRegistrationCount() {
        return this.registrationCount;
    }
    /**
     * Gets the registrationStatus property value. The registrationStatus property
     * @return a RegistrationStatusType
     */
    @jakarta.annotation.Nullable
    public RegistrationStatusType getRegistrationStatus() {
        return this.registrationStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("registrationCount", this.getRegistrationCount());
        writer.writeEnumValue("registrationStatus", this.getRegistrationStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the registrationCount property value. Provides the registration count for your tenant.
     * @param value Value to set for the registrationCount property.
     */
    public void setRegistrationCount(@jakarta.annotation.Nullable final Long value) {
        this.registrationCount = value;
    }
    /**
     * Sets the registrationStatus property value. The registrationStatus property
     * @param value Value to set for the registrationStatus property.
     */
    public void setRegistrationStatus(@jakarta.annotation.Nullable final RegistrationStatusType value) {
        this.registrationStatus = value;
    }
}
