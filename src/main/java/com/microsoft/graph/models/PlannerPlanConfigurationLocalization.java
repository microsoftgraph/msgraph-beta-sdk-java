package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerPlanConfigurationLocalization extends Entity implements Parsable {
    /**
     * Instantiates a new PlannerPlanConfigurationLocalization and sets the default values.
     */
    public PlannerPlanConfigurationLocalization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerPlanConfigurationLocalization
     */
    @jakarta.annotation.Nonnull
    public static PlannerPlanConfigurationLocalization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlanConfigurationLocalization();
    }
    /**
     * Gets the buckets property value. Localized names for configured buckets in the plan configuration.
     * @return a java.util.List<PlannerPlanConfigurationBucketLocalization>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlanConfigurationBucketLocalization> getBuckets() {
        return this.backingStore.get("buckets");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfObjectValues(PlannerPlanConfigurationBucketLocalization::createFromDiscriminatorValue)); });
        deserializerMap.put("languageTag", (n) -> { this.setLanguageTag(n.getStringValue()); });
        deserializerMap.put("planTitle", (n) -> { this.setPlanTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the languageTag property value. The language code associated with the localized names in this object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLanguageTag() {
        return this.backingStore.get("languageTag");
    }
    /**
     * Gets the planTitle property value. Localized title of the plan.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPlanTitle() {
        return this.backingStore.get("planTitle");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("buckets", this.getBuckets());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeStringValue("planTitle", this.getPlanTitle());
    }
    /**
     * Sets the buckets property value. Localized names for configured buckets in the plan configuration.
     * @param value Value to set for the buckets property.
     */
    public void setBuckets(@jakarta.annotation.Nullable final java.util.List<PlannerPlanConfigurationBucketLocalization> value) {
        this.backingStore.set("buckets", value);
    }
    /**
     * Sets the languageTag property value. The language code associated with the localized names in this object.
     * @param value Value to set for the languageTag property.
     */
    public void setLanguageTag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("languageTag", value);
    }
    /**
     * Sets the planTitle property value. Localized title of the plan.
     * @param value Value to set for the planTitle property.
     */
    public void setPlanTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planTitle", value);
    }
}
