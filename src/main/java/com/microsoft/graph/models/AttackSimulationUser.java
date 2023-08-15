package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttackSimulationUser implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Display name of the user.
     */
    private String displayName;
    /**
     * Email address of the user.
     */
    private String email;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Number of days the user is OOF during a simulation journey/course of a campaign.
     */
    private Integer outOfOfficeDays;
    /**
     * The id property value of the user resource that represents the user in the Azure Active Directory tenant.
     */
    private String userId;
    /**
     * Instantiates a new attackSimulationUser and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AttackSimulationUser() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attackSimulationUser
     */
    @jakarta.annotation.Nonnull
    public static AttackSimulationUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationUser();
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
     * Gets the displayName property value. Display name of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the email property value. Email address of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("outOfOfficeDays", (n) -> { this.setOutOfOfficeDays(n.getIntegerValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
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
     * Gets the outOfOfficeDays property value. Number of days the user is OOF during a simulation journey/course of a campaign.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getOutOfOfficeDays() {
        return this.outOfOfficeDays;
    }
    /**
     * Gets the userId property value. The id property value of the user resource that represents the user in the Azure Active Directory tenant.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("outOfOfficeDays", this.getOutOfOfficeDays());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. Display name of the user.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the email property value. Email address of the user.
     * @param value Value to set for the email property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the outOfOfficeDays property value. Number of days the user is OOF during a simulation journey/course of a campaign.
     * @param value Value to set for the outOfOfficeDays property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOutOfOfficeDays(@jakarta.annotation.Nullable final Integer value) {
        this.outOfOfficeDays = value;
    }
    /**
     * Sets the userId property value. The id property value of the user resource that represents the user in the Azure Active Directory tenant.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
