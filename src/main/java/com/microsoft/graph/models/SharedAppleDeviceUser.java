package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharedAppleDeviceUser implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Data quota
     */
    private Long dataQuota;
    /**
     * Data to sync
     */
    private Boolean dataToSync;
    /**
     * Data quota
     */
    private Long dataUsed;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * User name
     */
    private String userPrincipalName;
    /**
     * Instantiates a new sharedAppleDeviceUser and sets the default values.
     */
    public SharedAppleDeviceUser() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharedAppleDeviceUser
     */
    @jakarta.annotation.Nonnull
    public static SharedAppleDeviceUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedAppleDeviceUser();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dataQuota property value. Data quota
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getDataQuota() {
        return this.dataQuota;
    }
    /**
     * Gets the dataToSync property value. Data to sync
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDataToSync() {
        return this.dataToSync;
    }
    /**
     * Gets the dataUsed property value. Data quota
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getDataUsed() {
        return this.dataUsed;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("dataQuota", (n) -> { this.setDataQuota(n.getLongValue()); });
        deserializerMap.put("dataToSync", (n) -> { this.setDataToSync(n.getBooleanValue()); });
        deserializerMap.put("dataUsed", (n) -> { this.setDataUsed(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the userPrincipalName property value. User name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("dataQuota", this.getDataQuota());
        writer.writeBooleanValue("dataToSync", this.getDataToSync());
        writer.writeLongValue("dataUsed", this.getDataUsed());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dataQuota property value. Data quota
     * @param value Value to set for the dataQuota property.
     */
    public void setDataQuota(@jakarta.annotation.Nullable final Long value) {
        this.dataQuota = value;
    }
    /**
     * Sets the dataToSync property value. Data to sync
     * @param value Value to set for the dataToSync property.
     */
    public void setDataToSync(@jakarta.annotation.Nullable final Boolean value) {
        this.dataToSync = value;
    }
    /**
     * Sets the dataUsed property value. Data quota
     * @param value Value to set for the dataUsed property.
     */
    public void setDataUsed(@jakarta.annotation.Nullable final Long value) {
        this.dataUsed = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the userPrincipalName property value. User name
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
