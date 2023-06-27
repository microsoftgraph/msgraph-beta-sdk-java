package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServicePrincipalCreationPolicy extends PolicyBase implements Parsable {
    /**
     * The excludes property
     */
    private java.util.List<ServicePrincipalCreationConditionSet> excludes;
    /**
     * The includes property
     */
    private java.util.List<ServicePrincipalCreationConditionSet> includes;
    /**
     * The isBuiltIn property
     */
    private Boolean isBuiltIn;
    /**
     * Instantiates a new ServicePrincipalCreationPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrincipalCreationPolicy() {
        super();
        this.setOdataType("#microsoft.graph.servicePrincipalCreationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrincipalCreationPolicy
     */
    @javax.annotation.Nonnull
    public static ServicePrincipalCreationPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalCreationPolicy();
    }
    /**
     * Gets the excludes property value. The excludes property
     * @return a servicePrincipalCreationConditionSet
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePrincipalCreationConditionSet> getExcludes() {
        return this.excludes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludes", (n) -> { this.setExcludes(n.getCollectionOfObjectValues(ServicePrincipalCreationConditionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("includes", (n) -> { this.setIncludes(n.getCollectionOfObjectValues(ServicePrincipalCreationConditionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includes property value. The includes property
     * @return a servicePrincipalCreationConditionSet
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePrincipalCreationConditionSet> getIncludes() {
        return this.includes;
    }
    /**
     * Gets the isBuiltIn property value. The isBuiltIn property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.isBuiltIn;
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
        writer.writeCollectionOfObjectValues("excludes", this.getExcludes());
        writer.writeCollectionOfObjectValues("includes", this.getIncludes());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
    }
    /**
     * Sets the excludes property value. The excludes property
     * @param value Value to set for the excludes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludes(@javax.annotation.Nullable final java.util.List<ServicePrincipalCreationConditionSet> value) {
        this.excludes = value;
    }
    /**
     * Sets the includes property value. The includes property
     * @param value Value to set for the includes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludes(@javax.annotation.Nullable final java.util.List<ServicePrincipalCreationConditionSet> value) {
        this.includes = value;
    }
    /**
     * Sets the isBuiltIn property value. The isBuiltIn property
     * @param value Value to set for the isBuiltIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBuiltIn(@javax.annotation.Nullable final Boolean value) {
        this.isBuiltIn = value;
    }
}
