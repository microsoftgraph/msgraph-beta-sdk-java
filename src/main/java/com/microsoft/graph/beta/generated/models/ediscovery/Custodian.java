package com.microsoft.graph.beta.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Custodian extends DataSourceContainer implements Parsable {
    /**
     * Instantiates a new {@link Custodian} and sets the default values.
     */
    public Custodian() {
        super();
        this.setOdataType("#microsoft.graph.ediscovery.custodian");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Custodian}
     */
    @jakarta.annotation.Nonnull
    public static Custodian createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Custodian();
    }
    /**
     * Gets the acknowledgedDateTime property value. Date and time the custodian acknowledged a hold notification.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAcknowledgedDateTime() {
        return this.backingStore.get("acknowledgedDateTime");
    }
    /**
     * Gets the applyHoldToSources property value. Identifies whether a custodian&apos;s sources were placed on hold during creation.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getApplyHoldToSources() {
        return this.backingStore.get("applyHoldToSources");
    }
    /**
     * Gets the email property value. Email address of the custodian.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acknowledgedDateTime", (n) -> { this.setAcknowledgedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("applyHoldToSources", (n) -> { this.setApplyHoldToSources(n.getBooleanValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("siteSources", (n) -> { this.setSiteSources(n.getCollectionOfObjectValues(SiteSource::createFromDiscriminatorValue)); });
        deserializerMap.put("unifiedGroupSources", (n) -> { this.setUnifiedGroupSources(n.getCollectionOfObjectValues(UnifiedGroupSource::createFromDiscriminatorValue)); });
        deserializerMap.put("userSources", (n) -> { this.setUserSources(n.getCollectionOfObjectValues(UserSource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the siteSources property value. Data source entity for SharePoint sites associated with the custodian.
     * @return a {@link java.util.List<SiteSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteSource> getSiteSources() {
        return this.backingStore.get("siteSources");
    }
    /**
     * Gets the unifiedGroupSources property value. Data source entity for groups associated with the custodian.
     * @return a {@link java.util.List<UnifiedGroupSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedGroupSource> getUnifiedGroupSources() {
        return this.backingStore.get("unifiedGroupSources");
    }
    /**
     * Gets the userSources property value. Data source entity for a the custodian. This is the container for a custodian&apos;s mailbox and OneDrive for Business site.
     * @return a {@link java.util.List<UserSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSource> getUserSources() {
        return this.backingStore.get("userSources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("acknowledgedDateTime", this.getAcknowledgedDateTime());
        writer.writeBooleanValue("applyHoldToSources", this.getApplyHoldToSources());
        writer.writeStringValue("email", this.getEmail());
        writer.writeCollectionOfObjectValues("siteSources", this.getSiteSources());
        writer.writeCollectionOfObjectValues("unifiedGroupSources", this.getUnifiedGroupSources());
        writer.writeCollectionOfObjectValues("userSources", this.getUserSources());
    }
    /**
     * Sets the acknowledgedDateTime property value. Date and time the custodian acknowledged a hold notification.
     * @param value Value to set for the acknowledgedDateTime property.
     */
    public void setAcknowledgedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("acknowledgedDateTime", value);
    }
    /**
     * Sets the applyHoldToSources property value. Identifies whether a custodian&apos;s sources were placed on hold during creation.
     * @param value Value to set for the applyHoldToSources property.
     */
    public void setApplyHoldToSources(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applyHoldToSources", value);
    }
    /**
     * Sets the email property value. Email address of the custodian.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the siteSources property value. Data source entity for SharePoint sites associated with the custodian.
     * @param value Value to set for the siteSources property.
     */
    public void setSiteSources(@jakarta.annotation.Nullable final java.util.List<SiteSource> value) {
        this.backingStore.set("siteSources", value);
    }
    /**
     * Sets the unifiedGroupSources property value. Data source entity for groups associated with the custodian.
     * @param value Value to set for the unifiedGroupSources property.
     */
    public void setUnifiedGroupSources(@jakarta.annotation.Nullable final java.util.List<UnifiedGroupSource> value) {
        this.backingStore.set("unifiedGroupSources", value);
    }
    /**
     * Sets the userSources property value. Data source entity for a the custodian. This is the container for a custodian&apos;s mailbox and OneDrive for Business site.
     * @param value Value to set for the userSources property.
     */
    public void setUserSources(@jakarta.annotation.Nullable final java.util.List<UserSource> value) {
        this.backingStore.set("userSources", value);
    }
}
