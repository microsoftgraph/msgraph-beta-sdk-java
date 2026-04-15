package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureADPremiumLicenseInsight extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AzureADPremiumLicenseInsight} and sets the default values.
     */
    public AzureADPremiumLicenseInsight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AzureADPremiumLicenseInsight}
     */
    @jakarta.annotation.Nonnull
    public static AzureADPremiumLicenseInsight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADPremiumLicenseInsight();
    }
    /**
     * Gets the entitledP1LicenseCount property value. The entitledP1LicenseCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getEntitledP1LicenseCount() {
        return this.backingStore.get("entitledP1LicenseCount");
    }
    /**
     * Gets the entitledP2LicenseCount property value. The entitledP2LicenseCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getEntitledP2LicenseCount() {
        return this.backingStore.get("entitledP2LicenseCount");
    }
    /**
     * Gets the entitledTotalLicenseCount property value. The entitledTotalLicenseCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getEntitledTotalLicenseCount() {
        return this.backingStore.get("entitledTotalLicenseCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("entitledP1LicenseCount", (n) -> { this.setEntitledP1LicenseCount(n.getLongValue()); });
        deserializerMap.put("entitledP2LicenseCount", (n) -> { this.setEntitledP2LicenseCount(n.getLongValue()); });
        deserializerMap.put("entitledTotalLicenseCount", (n) -> { this.setEntitledTotalLicenseCount(n.getLongValue()); });
        deserializerMap.put("internetAccessFeatureUtilizations", (n) -> { this.setInternetAccessFeatureUtilizations(n.getObjectValue(InternetAccessFeatureUtilizations::createFromDiscriminatorValue)); });
        deserializerMap.put("p1FeatureUtilizations", (n) -> { this.setP1FeatureUtilizations(n.getObjectValue(AzureADPremiumP1FeatureUtilizations::createFromDiscriminatorValue)); });
        deserializerMap.put("p2FeatureUtilizations", (n) -> { this.setP2FeatureUtilizations(n.getObjectValue(AzureADPremiumP2FeatureUtilizations::createFromDiscriminatorValue)); });
        deserializerMap.put("privateAccessFeatureUtilizations", (n) -> { this.setPrivateAccessFeatureUtilizations(n.getObjectValue(PrivateAccessFeatureUtilizations::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internetAccessFeatureUtilizations property value. The internetAccessFeatureUtilizations property
     * @return a {@link InternetAccessFeatureUtilizations}
     */
    @jakarta.annotation.Nullable
    public InternetAccessFeatureUtilizations getInternetAccessFeatureUtilizations() {
        return this.backingStore.get("internetAccessFeatureUtilizations");
    }
    /**
     * Gets the p1FeatureUtilizations property value. The p1FeatureUtilizations property
     * @return a {@link AzureADPremiumP1FeatureUtilizations}
     */
    @jakarta.annotation.Nullable
    public AzureADPremiumP1FeatureUtilizations getP1FeatureUtilizations() {
        return this.backingStore.get("p1FeatureUtilizations");
    }
    /**
     * Gets the p2FeatureUtilizations property value. The p2FeatureUtilizations property
     * @return a {@link AzureADPremiumP2FeatureUtilizations}
     */
    @jakarta.annotation.Nullable
    public AzureADPremiumP2FeatureUtilizations getP2FeatureUtilizations() {
        return this.backingStore.get("p2FeatureUtilizations");
    }
    /**
     * Gets the privateAccessFeatureUtilizations property value. The privateAccessFeatureUtilizations property
     * @return a {@link PrivateAccessFeatureUtilizations}
     */
    @jakarta.annotation.Nullable
    public PrivateAccessFeatureUtilizations getPrivateAccessFeatureUtilizations() {
        return this.backingStore.get("privateAccessFeatureUtilizations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("entitledP1LicenseCount", this.getEntitledP1LicenseCount());
        writer.writeLongValue("entitledP2LicenseCount", this.getEntitledP2LicenseCount());
        writer.writeLongValue("entitledTotalLicenseCount", this.getEntitledTotalLicenseCount());
        writer.writeObjectValue("internetAccessFeatureUtilizations", this.getInternetAccessFeatureUtilizations());
        writer.writeObjectValue("p1FeatureUtilizations", this.getP1FeatureUtilizations());
        writer.writeObjectValue("p2FeatureUtilizations", this.getP2FeatureUtilizations());
        writer.writeObjectValue("privateAccessFeatureUtilizations", this.getPrivateAccessFeatureUtilizations());
    }
    /**
     * Sets the entitledP1LicenseCount property value. The entitledP1LicenseCount property
     * @param value Value to set for the entitledP1LicenseCount property.
     */
    public void setEntitledP1LicenseCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("entitledP1LicenseCount", value);
    }
    /**
     * Sets the entitledP2LicenseCount property value. The entitledP2LicenseCount property
     * @param value Value to set for the entitledP2LicenseCount property.
     */
    public void setEntitledP2LicenseCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("entitledP2LicenseCount", value);
    }
    /**
     * Sets the entitledTotalLicenseCount property value. The entitledTotalLicenseCount property
     * @param value Value to set for the entitledTotalLicenseCount property.
     */
    public void setEntitledTotalLicenseCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("entitledTotalLicenseCount", value);
    }
    /**
     * Sets the internetAccessFeatureUtilizations property value. The internetAccessFeatureUtilizations property
     * @param value Value to set for the internetAccessFeatureUtilizations property.
     */
    public void setInternetAccessFeatureUtilizations(@jakarta.annotation.Nullable final InternetAccessFeatureUtilizations value) {
        this.backingStore.set("internetAccessFeatureUtilizations", value);
    }
    /**
     * Sets the p1FeatureUtilizations property value. The p1FeatureUtilizations property
     * @param value Value to set for the p1FeatureUtilizations property.
     */
    public void setP1FeatureUtilizations(@jakarta.annotation.Nullable final AzureADPremiumP1FeatureUtilizations value) {
        this.backingStore.set("p1FeatureUtilizations", value);
    }
    /**
     * Sets the p2FeatureUtilizations property value. The p2FeatureUtilizations property
     * @param value Value to set for the p2FeatureUtilizations property.
     */
    public void setP2FeatureUtilizations(@jakarta.annotation.Nullable final AzureADPremiumP2FeatureUtilizations value) {
        this.backingStore.set("p2FeatureUtilizations", value);
    }
    /**
     * Sets the privateAccessFeatureUtilizations property value. The privateAccessFeatureUtilizations property
     * @param value Value to set for the privateAccessFeatureUtilizations property.
     */
    public void setPrivateAccessFeatureUtilizations(@jakarta.annotation.Nullable final PrivateAccessFeatureUtilizations value) {
        this.backingStore.set("privateAccessFeatureUtilizations", value);
    }
}
