package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TooManyGlobalAdminsAssignedToTenantAlertConfiguration extends UnifiedRoleManagementAlertConfiguration implements Parsable {
    /**
     * The threshold for the number of accounts assigned the Global Administrator role in the tenant. Triggers an alert if the number of global administrators in the tenant reaches or crosses this threshold value.
     */
    private Integer globalAdminCountThreshold;
    /**
     * Threshold of the percentage of global administrators out of all the role assignments in the tenant. Triggers an alert if the percentage in the tenant reaches or crosses this threshold value.
     */
    private Integer percentageOfGlobalAdminsOutOfRolesThreshold;
    /**
     * Instantiates a new tooManyGlobalAdminsAssignedToTenantAlertConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TooManyGlobalAdminsAssignedToTenantAlertConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.tooManyGlobalAdminsAssignedToTenantAlertConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tooManyGlobalAdminsAssignedToTenantAlertConfiguration
     */
    @javax.annotation.Nonnull
    public static TooManyGlobalAdminsAssignedToTenantAlertConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TooManyGlobalAdminsAssignedToTenantAlertConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("globalAdminCountThreshold", (n) -> { this.setGlobalAdminCountThreshold(n.getIntegerValue()); });
        deserializerMap.put("percentageOfGlobalAdminsOutOfRolesThreshold", (n) -> { this.setPercentageOfGlobalAdminsOutOfRolesThreshold(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the globalAdminCountThreshold property value. The threshold for the number of accounts assigned the Global Administrator role in the tenant. Triggers an alert if the number of global administrators in the tenant reaches or crosses this threshold value.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGlobalAdminCountThreshold() {
        return this.globalAdminCountThreshold;
    }
    /**
     * Gets the percentageOfGlobalAdminsOutOfRolesThreshold property value. Threshold of the percentage of global administrators out of all the role assignments in the tenant. Triggers an alert if the percentage in the tenant reaches or crosses this threshold value.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPercentageOfGlobalAdminsOutOfRolesThreshold() {
        return this.percentageOfGlobalAdminsOutOfRolesThreshold;
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
        writer.writeIntegerValue("globalAdminCountThreshold", this.getGlobalAdminCountThreshold());
        writer.writeIntegerValue("percentageOfGlobalAdminsOutOfRolesThreshold", this.getPercentageOfGlobalAdminsOutOfRolesThreshold());
    }
    /**
     * Sets the globalAdminCountThreshold property value. The threshold for the number of accounts assigned the Global Administrator role in the tenant. Triggers an alert if the number of global administrators in the tenant reaches or crosses this threshold value.
     * @param value Value to set for the globalAdminCountThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGlobalAdminCountThreshold(@javax.annotation.Nullable final Integer value) {
        this.globalAdminCountThreshold = value;
    }
    /**
     * Sets the percentageOfGlobalAdminsOutOfRolesThreshold property value. Threshold of the percentage of global administrators out of all the role assignments in the tenant. Triggers an alert if the percentage in the tenant reaches or crosses this threshold value.
     * @param value Value to set for the percentageOfGlobalAdminsOutOfRolesThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercentageOfGlobalAdminsOutOfRolesThreshold(@javax.annotation.Nullable final Integer value) {
        this.percentageOfGlobalAdminsOutOfRolesThreshold = value;
    }
}
