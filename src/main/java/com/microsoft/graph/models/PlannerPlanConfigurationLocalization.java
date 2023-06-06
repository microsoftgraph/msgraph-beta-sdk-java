package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerPlanConfigurationLocalization extends Entity implements Parsable {
    /** Localized names for configured buckets in the plan configuration. */
    private java.util.List<PlannerPlanConfigurationBucketLocalization> buckets;
    /** The language code associated with the localized names in this object. */
    private String languageTag;
    /** Localized title of the plan. */
    private String planTitle;
    /**
     * Instantiates a new plannerPlanConfigurationLocalization and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerPlanConfigurationLocalization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerPlanConfigurationLocalization
     */
    @javax.annotation.Nonnull
    public static PlannerPlanConfigurationLocalization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlanConfigurationLocalization();
    }
    /**
     * Gets the buckets property value. Localized names for configured buckets in the plan configuration.
     * @return a plannerPlanConfigurationBucketLocalization
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlanConfigurationBucketLocalization> getBuckets() {
        return this.buckets;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfObjectValues(PlannerPlanConfigurationBucketLocalization::createFromDiscriminatorValue)); });
        deserializerMap.put("languageTag", (n) -> { this.setLanguageTag(n.getStringValue()); });
        deserializerMap.put("planTitle", (n) -> { this.setPlanTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the languageTag property value. The language code associated with the localized names in this object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this.languageTag;
    }
    /**
     * Gets the planTitle property value. Localized title of the plan.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlanTitle() {
        return this.planTitle;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("buckets", this.getBuckets());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeStringValue("planTitle", this.getPlanTitle());
    }
    /**
     * Sets the buckets property value. Localized names for configured buckets in the plan configuration.
     * @param value Value to set for the buckets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuckets(@javax.annotation.Nullable final java.util.List<PlannerPlanConfigurationBucketLocalization> value) {
        this.buckets = value;
    }
    /**
     * Sets the languageTag property value. The language code associated with the localized names in this object.
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this.languageTag = value;
    }
    /**
     * Sets the planTitle property value. Localized title of the plan.
     * @param value Value to set for the planTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlanTitle(@javax.annotation.Nullable final String value) {
        this.planTitle = value;
    }
}
