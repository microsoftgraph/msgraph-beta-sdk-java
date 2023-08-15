package com.microsoft.graph.models.industrydata;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.LongRunningOperation;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IndustryDataRoot extends Entity implements Parsable {
    /**
     * Set of connectors for importing data from source systems.
     */
    private java.util.List<IndustryDataConnector> dataConnectors;
    /**
     * Set of data import flow activities to bring data into the canonical store via a connector.
     */
    private java.util.List<InboundFlow> inboundFlows;
    /**
     * Set of ephemeral operations that the system runs currently. Read-only.
     */
    private java.util.List<LongRunningOperation> operations;
    /**
     * Set of user modifiable system picker types.
     */
    private java.util.List<ReferenceDefinition> referenceDefinitions;
    /**
     * Set of groups of individual roles that makes role-based admin simpler.
     */
    private java.util.List<RoleGroup> roleGroups;
    /**
     * Set of ephemeral runs which present the point-in-time that diagnostic state of activities performed by the system. Read-only.
     */
    private java.util.List<IndustryDataRun> runs;
    /**
     * Set of source definitions that represents real-world external systems.
     */
    private java.util.List<SourceSystemDefinition> sourceSystems;
    /**
     * Set of years represented in the system.
     */
    private java.util.List<YearTimePeriodDefinition> years;
    /**
     * Instantiates a new industryDataRoot and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public IndustryDataRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a industryDataRoot
     */
    @jakarta.annotation.Nonnull
    public static IndustryDataRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IndustryDataRoot();
    }
    /**
     * Gets the dataConnectors property value. Set of connectors for importing data from source systems.
     * @return a industryDataConnector
     */
    @jakarta.annotation.Nullable
    public java.util.List<IndustryDataConnector> getDataConnectors() {
        return this.dataConnectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dataConnectors", (n) -> { this.setDataConnectors(n.getCollectionOfObjectValues(IndustryDataConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundFlows", (n) -> { this.setInboundFlows(n.getCollectionOfObjectValues(InboundFlow::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(LongRunningOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("referenceDefinitions", (n) -> { this.setReferenceDefinitions(n.getCollectionOfObjectValues(ReferenceDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleGroups", (n) -> { this.setRoleGroups(n.getCollectionOfObjectValues(RoleGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("runs", (n) -> { this.setRuns(n.getCollectionOfObjectValues(IndustryDataRun::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceSystems", (n) -> { this.setSourceSystems(n.getCollectionOfObjectValues(SourceSystemDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("years", (n) -> { this.setYears(n.getCollectionOfObjectValues(YearTimePeriodDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inboundFlows property value. Set of data import flow activities to bring data into the canonical store via a connector.
     * @return a inboundFlow
     */
    @jakarta.annotation.Nullable
    public java.util.List<InboundFlow> getInboundFlows() {
        return this.inboundFlows;
    }
    /**
     * Gets the operations property value. Set of ephemeral operations that the system runs currently. Read-only.
     * @return a longRunningOperation
     */
    @jakarta.annotation.Nullable
    public java.util.List<LongRunningOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the referenceDefinitions property value. Set of user modifiable system picker types.
     * @return a referenceDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReferenceDefinition> getReferenceDefinitions() {
        return this.referenceDefinitions;
    }
    /**
     * Gets the roleGroups property value. Set of groups of individual roles that makes role-based admin simpler.
     * @return a roleGroup
     */
    @jakarta.annotation.Nullable
    public java.util.List<RoleGroup> getRoleGroups() {
        return this.roleGroups;
    }
    /**
     * Gets the runs property value. Set of ephemeral runs which present the point-in-time that diagnostic state of activities performed by the system. Read-only.
     * @return a industryDataRun
     */
    @jakarta.annotation.Nullable
    public java.util.List<IndustryDataRun> getRuns() {
        return this.runs;
    }
    /**
     * Gets the sourceSystems property value. Set of source definitions that represents real-world external systems.
     * @return a sourceSystemDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<SourceSystemDefinition> getSourceSystems() {
        return this.sourceSystems;
    }
    /**
     * Gets the years property value. Set of years represented in the system.
     * @return a yearTimePeriodDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<YearTimePeriodDefinition> getYears() {
        return this.years;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("dataConnectors", this.getDataConnectors());
        writer.writeCollectionOfObjectValues("inboundFlows", this.getInboundFlows());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("referenceDefinitions", this.getReferenceDefinitions());
        writer.writeCollectionOfObjectValues("roleGroups", this.getRoleGroups());
        writer.writeCollectionOfObjectValues("runs", this.getRuns());
        writer.writeCollectionOfObjectValues("sourceSystems", this.getSourceSystems());
        writer.writeCollectionOfObjectValues("years", this.getYears());
    }
    /**
     * Sets the dataConnectors property value. Set of connectors for importing data from source systems.
     * @param value Value to set for the dataConnectors property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDataConnectors(@jakarta.annotation.Nullable final java.util.List<IndustryDataConnector> value) {
        this.dataConnectors = value;
    }
    /**
     * Sets the inboundFlows property value. Set of data import flow activities to bring data into the canonical store via a connector.
     * @param value Value to set for the inboundFlows property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInboundFlows(@jakarta.annotation.Nullable final java.util.List<InboundFlow> value) {
        this.inboundFlows = value;
    }
    /**
     * Sets the operations property value. Set of ephemeral operations that the system runs currently. Read-only.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<LongRunningOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the referenceDefinitions property value. Set of user modifiable system picker types.
     * @param value Value to set for the referenceDefinitions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReferenceDefinitions(@jakarta.annotation.Nullable final java.util.List<ReferenceDefinition> value) {
        this.referenceDefinitions = value;
    }
    /**
     * Sets the roleGroups property value. Set of groups of individual roles that makes role-based admin simpler.
     * @param value Value to set for the roleGroups property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleGroups(@jakarta.annotation.Nullable final java.util.List<RoleGroup> value) {
        this.roleGroups = value;
    }
    /**
     * Sets the runs property value. Set of ephemeral runs which present the point-in-time that diagnostic state of activities performed by the system. Read-only.
     * @param value Value to set for the runs property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRuns(@jakarta.annotation.Nullable final java.util.List<IndustryDataRun> value) {
        this.runs = value;
    }
    /**
     * Sets the sourceSystems property value. Set of source definitions that represents real-world external systems.
     * @param value Value to set for the sourceSystems property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSourceSystems(@jakarta.annotation.Nullable final java.util.List<SourceSystemDefinition> value) {
        this.sourceSystems = value;
    }
    /**
     * Sets the years property value. Set of years represented in the system.
     * @param value Value to set for the years property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setYears(@jakarta.annotation.Nullable final java.util.List<YearTimePeriodDefinition> value) {
        this.years = value;
    }
}
