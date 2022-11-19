package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcSharedUseServicePlan extends Entity implements Parsable {
    /** The displayName property */
    private String _displayName;
    /** The totalCount property */
    private Integer _totalCount;
    /** The usedCount property */
    private Integer _usedCount;
    /**
     * Instantiates a new CloudPcSharedUseServicePlan and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcSharedUseServicePlan() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcSharedUseServicePlan");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcSharedUseServicePlan
     */
    @javax.annotation.Nonnull
    public static CloudPcSharedUseServicePlan createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSharedUseServicePlan();
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcSharedUseServicePlan currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("totalCount", (n) -> { currentObject.setTotalCount(n.getIntegerValue()); });
        deserializerMap.put("usedCount", (n) -> { currentObject.setUsedCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalCount property value. The totalCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalCount() {
        return this._totalCount;
    }
    /**
     * Gets the usedCount property value. The usedCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsedCount() {
        return this._usedCount;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("totalCount", this.getTotalCount());
        writer.writeIntegerValue("usedCount", this.getUsedCount());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the totalCount property value. The totalCount property
     * @param value Value to set for the totalCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalCount(@javax.annotation.Nullable final Integer value) {
        this._totalCount = value;
    }
    /**
     * Sets the usedCount property value. The usedCount property
     * @param value Value to set for the usedCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsedCount(@javax.annotation.Nullable final Integer value) {
        this._usedCount = value;
    }
}
