package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerPlanConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new PlannerPlanConfiguration and sets the default values.
     */
    public PlannerPlanConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerPlanConfiguration
     */
    @jakarta.annotation.Nonnull
    public static PlannerPlanConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlanConfiguration();
    }
    /**
     * Gets the buckets property value. List the buckets that should be created in the plan.
     * @return a java.util.List<PlannerPlanConfigurationBucketDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlanConfigurationBucketDefinition> getBuckets() {
        return this.backingStore.get("buckets");
    }
    /**
     * Gets the createdBy property value. The identity of the creator of the plan configuration.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the plan configuration was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the defaultLanguage property value. The language code for the default language to be used for the names of the objects created for the plan.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultLanguage() {
        return this.backingStore.get("defaultLanguage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfObjectValues(PlannerPlanConfigurationBucketDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("defaultLanguage", (n) -> { this.setDefaultLanguage(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("localizations", (n) -> { this.setLocalizations(n.getCollectionOfObjectValues(PlannerPlanConfigurationLocalization::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The identity of the user who last modified the plan configuration.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the plan configuration was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the localizations property value. Localized names for the plan configuration.
     * @return a java.util.List<PlannerPlanConfigurationLocalization>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlanConfigurationLocalization> getLocalizations() {
        return this.backingStore.get("localizations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("buckets", this.getBuckets());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("defaultLanguage", this.getDefaultLanguage());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("localizations", this.getLocalizations());
    }
    /**
     * Sets the buckets property value. List the buckets that should be created in the plan.
     * @param value Value to set for the buckets property.
     */
    public void setBuckets(@jakarta.annotation.Nullable final java.util.List<PlannerPlanConfigurationBucketDefinition> value) {
        this.backingStore.set("buckets", value);
    }
    /**
     * Sets the createdBy property value. The identity of the creator of the plan configuration.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the plan configuration was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the defaultLanguage property value. The language code for the default language to be used for the names of the objects created for the plan.
     * @param value Value to set for the defaultLanguage property.
     */
    public void setDefaultLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultLanguage", value);
    }
    /**
     * Sets the lastModifiedBy property value. The identity of the user who last modified the plan configuration.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the plan configuration was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the localizations property value. Localized names for the plan configuration.
     * @param value Value to set for the localizations property.
     */
    public void setLocalizations(@jakarta.annotation.Nullable final java.util.List<PlannerPlanConfigurationLocalization> value) {
        this.backingStore.set("localizations", value);
    }
}
