package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.ActionUrl;
import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementTemplate extends Entity implements Parsable {
    /**
     * The management category for the management template. Possible values are: custom, devices, identity, unknownFutureValue. Required. Read-only.
     */
    private ManagementCategory category;
    /**
     * The createdByUserId property
     */
    private String createdByUserId;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description for the management template. Optional. Read-only.
     */
    private String description;
    /**
     * The display name for the management template. Required. Read-only.
     */
    private String displayName;
    /**
     * The informationLinks property
     */
    private java.util.List<ActionUrl> informationLinks;
    /**
     * The lastActionByUserId property
     */
    private String lastActionByUserId;
    /**
     * The lastActionDateTime property
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * The managementTemplateCollections property
     */
    private java.util.List<ManagementTemplateCollection> managementTemplateCollections;
    /**
     * The managementTemplateSteps property
     */
    private java.util.List<ManagementTemplateStep> managementTemplateSteps;
    /**
     * The collection of parameters used by the management template. Optional. Read-only.
     */
    private java.util.List<TemplateParameter> parameters;
    /**
     * The priority property
     */
    private Integer priority;
    /**
     * The provider property
     */
    private ManagementProvider provider;
    /**
     * The userImpact property
     */
    private String userImpact;
    /**
     * The version property
     */
    private Integer version;
    /**
     * The collection of workload actions associated with the management template. Optional. Read-only.
     */
    private java.util.List<WorkloadAction> workloadActions;
    /**
     * Instantiates a new ManagementTemplate and sets the default values.
     */
    public ManagementTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagementTemplate
     */
    @jakarta.annotation.Nonnull
    public static ManagementTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplate();
    }
    /**
     * Gets the category property value. The management category for the management template. Possible values are: custom, devices, identity, unknownFutureValue. Required. Read-only.
     * @return a ManagementCategory
     */
    @jakarta.annotation.Nullable
    public ManagementCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description for the management template. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name for the management template. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ManagementCategory.class)); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("informationLinks", (n) -> { this.setInformationLinks(n.getCollectionOfObjectValues(ActionUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementTemplateCollections", (n) -> { this.setManagementTemplateCollections(n.getCollectionOfObjectValues(ManagementTemplateCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("managementTemplateSteps", (n) -> { this.setManagementTemplateSteps(n.getCollectionOfObjectValues(ManagementTemplateStep::createFromDiscriminatorValue)); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getCollectionOfObjectValues(TemplateParameter::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getEnumValue(ManagementProvider.class)); });
        deserializerMap.put("userImpact", (n) -> { this.setUserImpact(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("workloadActions", (n) -> { this.setWorkloadActions(n.getCollectionOfObjectValues(WorkloadAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the informationLinks property value. The informationLinks property
     * @return a java.util.List<ActionUrl>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActionUrl> getInformationLinks() {
        return this.informationLinks;
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastActionByUserId() {
        return this.lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
    /**
     * Gets the managementTemplateCollections property value. The managementTemplateCollections property
     * @return a java.util.List<ManagementTemplateCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateCollection> getManagementTemplateCollections() {
        return this.managementTemplateCollections;
    }
    /**
     * Gets the managementTemplateSteps property value. The managementTemplateSteps property
     * @return a java.util.List<ManagementTemplateStep>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStep> getManagementTemplateSteps() {
        return this.managementTemplateSteps;
    }
    /**
     * Gets the parameters property value. The collection of parameters used by the management template. Optional. Read-only.
     * @return a java.util.List<TemplateParameter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TemplateParameter> getParameters() {
        return this.parameters;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the provider property value. The provider property
     * @return a ManagementProvider
     */
    @jakarta.annotation.Nullable
    public ManagementProvider getProvider() {
        return this.provider;
    }
    /**
     * Gets the userImpact property value. The userImpact property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserImpact() {
        return this.userImpact;
    }
    /**
     * Gets the version property value. The version property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Gets the workloadActions property value. The collection of workload actions associated with the management template. Optional. Read-only.
     * @return a java.util.List<WorkloadAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkloadAction> getWorkloadActions() {
        return this.workloadActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("informationLinks", this.getInformationLinks());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeCollectionOfObjectValues("managementTemplateCollections", this.getManagementTemplateCollections());
        writer.writeCollectionOfObjectValues("managementTemplateSteps", this.getManagementTemplateSteps());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeEnumValue("provider", this.getProvider());
        writer.writeStringValue("userImpact", this.getUserImpact());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeCollectionOfObjectValues("workloadActions", this.getWorkloadActions());
    }
    /**
     * Sets the category property value. The management category for the management template. Possible values are: custom, devices, identity, unknownFutureValue. Required. Read-only.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final ManagementCategory value) {
        this.category = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description for the management template. Optional. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name for the management template. Required. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the informationLinks property value. The informationLinks property
     * @param value Value to set for the informationLinks property.
     */
    public void setInformationLinks(@jakarta.annotation.Nullable final java.util.List<ActionUrl> value) {
        this.informationLinks = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     */
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the managementTemplateCollections property value. The managementTemplateCollections property
     * @param value Value to set for the managementTemplateCollections property.
     */
    public void setManagementTemplateCollections(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateCollection> value) {
        this.managementTemplateCollections = value;
    }
    /**
     * Sets the managementTemplateSteps property value. The managementTemplateSteps property
     * @param value Value to set for the managementTemplateSteps property.
     */
    public void setManagementTemplateSteps(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStep> value) {
        this.managementTemplateSteps = value;
    }
    /**
     * Sets the parameters property value. The collection of parameters used by the management template. Optional. Read-only.
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final java.util.List<TemplateParameter> value) {
        this.parameters = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final ManagementProvider value) {
        this.provider = value;
    }
    /**
     * Sets the userImpact property value. The userImpact property
     * @param value Value to set for the userImpact property.
     */
    public void setUserImpact(@jakarta.annotation.Nullable final String value) {
        this.userImpact = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
    /**
     * Sets the workloadActions property value. The collection of workload actions associated with the management template. Optional. Read-only.
     * @param value Value to set for the workloadActions property.
     */
    public void setWorkloadActions(@jakarta.annotation.Nullable final java.util.List<WorkloadAction> value) {
        this.workloadActions = value;
    }
}
