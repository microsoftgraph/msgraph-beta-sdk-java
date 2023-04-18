package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerPlanPropertyRule extends PlannerPropertyRule implements Parsable {
    /** The buckets property */
    private java.util.List<String> buckets;
    /** The categoryDescriptions property */
    private PlannerFieldRules categoryDescriptions;
    /** The tasks property */
    private java.util.List<String> tasks;
    /** The title property */
    private PlannerFieldRules title;
    /**
     * Instantiates a new PlannerPlanPropertyRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerPlanPropertyRule() {
        super();
        this.setOdataType("#microsoft.graph.plannerPlanPropertyRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerPlanPropertyRule
     */
    @javax.annotation.Nonnull
    public static PlannerPlanPropertyRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlanPropertyRule();
    }
    /**
     * Gets the buckets property value. The buckets property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBuckets() {
        return this.buckets;
    }
    /**
     * Gets the categoryDescriptions property value. The categoryDescriptions property
     * @return a plannerFieldRules
     */
    @javax.annotation.Nullable
    public PlannerFieldRules getCategoryDescriptions() {
        return this.categoryDescriptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("categoryDescriptions", (n) -> { this.setCategoryDescriptions(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getObjectValue(PlannerFieldRules::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tasks property value. The tasks property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTasks() {
        return this.tasks;
    }
    /**
     * Gets the title property value. The title property
     * @return a plannerFieldRules
     */
    @javax.annotation.Nullable
    public PlannerFieldRules getTitle() {
        return this.title;
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
        writer.writeCollectionOfPrimitiveValues("buckets", this.getBuckets());
        writer.writeObjectValue("categoryDescriptions", this.getCategoryDescriptions());
        writer.writeCollectionOfPrimitiveValues("tasks", this.getTasks());
        writer.writeObjectValue("title", this.getTitle());
    }
    /**
     * Sets the buckets property value. The buckets property
     * @param value Value to set for the buckets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuckets(@javax.annotation.Nullable final java.util.List<String> value) {
        this.buckets = value;
    }
    /**
     * Sets the categoryDescriptions property value. The categoryDescriptions property
     * @param value Value to set for the categoryDescriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryDescriptions(@javax.annotation.Nullable final PlannerFieldRules value) {
        this.categoryDescriptions = value;
    }
    /**
     * Sets the tasks property value. The tasks property
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<String> value) {
        this.tasks = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final PlannerFieldRules value) {
        this.title = value;
    }
}
