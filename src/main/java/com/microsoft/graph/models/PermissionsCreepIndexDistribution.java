package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionsCreepIndexDistribution extends Entity implements Parsable {
    /**
     * Instantiates a new PermissionsCreepIndexDistribution and sets the default values.
     */
    public PermissionsCreepIndexDistribution() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PermissionsCreepIndexDistribution
     */
    @jakarta.annotation.Nonnull
    public static PermissionsCreepIndexDistribution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionsCreepIndexDistribution();
    }
    /**
     * Gets the authorizationSystem property value. The authorizationSystem property
     * @return a AuthorizationSystem
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystem getAuthorizationSystem() {
        return this.backingStore.get("authorizationSystem");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authorizationSystem", (n) -> { this.setAuthorizationSystem(n.getObjectValue(AuthorizationSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("highRiskProfile", (n) -> { this.setHighRiskProfile(n.getObjectValue(RiskProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("lowRiskProfile", (n) -> { this.setLowRiskProfile(n.getObjectValue(RiskProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("mediumRiskProfile", (n) -> { this.setMediumRiskProfile(n.getObjectValue(RiskProfile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the highRiskProfile property value. The highRiskProfile property
     * @return a RiskProfile
     */
    @jakarta.annotation.Nullable
    public RiskProfile getHighRiskProfile() {
        return this.backingStore.get("highRiskProfile");
    }
    /**
     * Gets the lowRiskProfile property value. The lowRiskProfile property
     * @return a RiskProfile
     */
    @jakarta.annotation.Nullable
    public RiskProfile getLowRiskProfile() {
        return this.backingStore.get("lowRiskProfile");
    }
    /**
     * Gets the mediumRiskProfile property value. The mediumRiskProfile property
     * @return a RiskProfile
     */
    @jakarta.annotation.Nullable
    public RiskProfile getMediumRiskProfile() {
        return this.backingStore.get("mediumRiskProfile");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authorizationSystem", this.getAuthorizationSystem());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("highRiskProfile", this.getHighRiskProfile());
        writer.writeObjectValue("lowRiskProfile", this.getLowRiskProfile());
        writer.writeObjectValue("mediumRiskProfile", this.getMediumRiskProfile());
    }
    /**
     * Sets the authorizationSystem property value. The authorizationSystem property
     * @param value Value to set for the authorizationSystem property.
     */
    public void setAuthorizationSystem(@jakarta.annotation.Nullable final AuthorizationSystem value) {
        this.backingStore.set("authorizationSystem", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the highRiskProfile property value. The highRiskProfile property
     * @param value Value to set for the highRiskProfile property.
     */
    public void setHighRiskProfile(@jakarta.annotation.Nullable final RiskProfile value) {
        this.backingStore.set("highRiskProfile", value);
    }
    /**
     * Sets the lowRiskProfile property value. The lowRiskProfile property
     * @param value Value to set for the lowRiskProfile property.
     */
    public void setLowRiskProfile(@jakarta.annotation.Nullable final RiskProfile value) {
        this.backingStore.set("lowRiskProfile", value);
    }
    /**
     * Sets the mediumRiskProfile property value. The mediumRiskProfile property
     * @param value Value to set for the mediumRiskProfile property.
     */
    public void setMediumRiskProfile(@jakarta.annotation.Nullable final RiskProfile value) {
        this.backingStore.set("mediumRiskProfile", value);
    }
}
