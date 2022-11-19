package com.microsoft.graph.devicemanagement.windowsdriverupdateprofiles.item.executeaction;

import com.microsoft.graph.models.DriverApprovalAction;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the executeAction method. */
public class ExecuteActionPostRequestBody implements AdditionalDataHolder, Parsable {
    /** An enum type to represent approval actions of single or list of drivers. */
    private DriverApprovalAction _actionName;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deploymentDate property */
    private OffsetDateTime _deploymentDate;
    /** The driverIds property */
    private java.util.List<String> _driverIds;
    /**
     * Instantiates a new executeActionPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExecuteActionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a executeActionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ExecuteActionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExecuteActionPostRequestBody();
    }
    /**
     * Gets the actionName property value. An enum type to represent approval actions of single or list of drivers.
     * @return a driverApprovalAction
     */
    @javax.annotation.Nullable
    public DriverApprovalAction getActionName() {
        return this._actionName;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the deploymentDate property value. The deploymentDate property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeploymentDate() {
        return this._deploymentDate;
    }
    /**
     * Gets the driverIds property value. The driverIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDriverIds() {
        return this._driverIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExecuteActionPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("actionName", (n) -> { currentObject.setActionName(n.getEnumValue(DriverApprovalAction.class)); });
        deserializerMap.put("deploymentDate", (n) -> { currentObject.setDeploymentDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("driverIds", (n) -> { currentObject.setDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actionName", this.getActionName());
        writer.writeOffsetDateTimeValue("deploymentDate", this.getDeploymentDate());
        writer.writeCollectionOfPrimitiveValues("driverIds", this.getDriverIds());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionName property value. An enum type to represent approval actions of single or list of drivers.
     * @param value Value to set for the actionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionName(@javax.annotation.Nullable final DriverApprovalAction value) {
        this._actionName = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deploymentDate property value. The deploymentDate property
     * @param value Value to set for the deploymentDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deploymentDate = value;
    }
    /**
     * Sets the driverIds property value. The driverIds property
     * @param value Value to set for the driverIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriverIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._driverIds = value;
    }
}
