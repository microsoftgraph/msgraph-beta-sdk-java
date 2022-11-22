package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class PlannerPlanConfigurationLocalization extends Entity implements Parsable {
    /** The buckets property */
    private java.util.List<PlannerPlanConfigurationBucketLocalization> _buckets;
    /** The languageTag property */
    private String _languageTag;
    /** The planTitle property */
    private String _planTitle;
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
     * Gets the buckets property value. The buckets property
     * @return a plannerPlanConfigurationBucketLocalization
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlanConfigurationBucketLocalization> getBuckets() {
        return this._buckets;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfObjectValues(PlannerPlanConfigurationBucketLocalization::createFromDiscriminatorValue)); });
        deserializerMap.put("languageTag", (n) -> { this.setLanguageTag(n.getStringValue()); });
        deserializerMap.put("planTitle", (n) -> { this.setPlanTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the languageTag property value. The languageTag property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this._languageTag;
    }
    /**
     * Gets the planTitle property value. The planTitle property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlanTitle() {
        return this._planTitle;
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
     * Sets the buckets property value. The buckets property
     * @param value Value to set for the buckets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuckets(@javax.annotation.Nullable final java.util.List<PlannerPlanConfigurationBucketLocalization> value) {
        this._buckets = value;
    }
    /**
     * Sets the languageTag property value. The languageTag property
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this._languageTag = value;
    }
    /**
     * Sets the planTitle property value. The planTitle property
     * @param value Value to set for the planTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlanTitle(@javax.annotation.Nullable final String value) {
        this._planTitle = value;
    }
}
