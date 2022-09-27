package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServicePrincipalCreationPolicy extends PolicyBase implements Parsable {
    /** The excludes property */
    private java.util.List<ServicePrincipalCreationConditionSet> _excludes;
    /** The includes property */
    private java.util.List<ServicePrincipalCreationConditionSet> _includes;
    /** The isBuiltIn property */
    private Boolean _isBuiltIn;
    /**
     * Instantiates a new ServicePrincipalCreationPolicy and sets the default values.
     * @return a void
     */
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
        return this._excludes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServicePrincipalCreationPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("excludes", (n) -> { currentObject.setExcludes(n.getCollectionOfObjectValues(ServicePrincipalCreationConditionSet::createFromDiscriminatorValue)); });
            this.put("includes", (n) -> { currentObject.setIncludes(n.getCollectionOfObjectValues(ServicePrincipalCreationConditionSet::createFromDiscriminatorValue)); });
            this.put("isBuiltIn", (n) -> { currentObject.setIsBuiltIn(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the includes property value. The includes property
     * @return a servicePrincipalCreationConditionSet
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePrincipalCreationConditionSet> getIncludes() {
        return this._includes;
    }
    /**
     * Gets the isBuiltIn property value. The isBuiltIn property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this._isBuiltIn;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setExcludes(@javax.annotation.Nullable final java.util.List<ServicePrincipalCreationConditionSet> value) {
        this._excludes = value;
    }
    /**
     * Sets the includes property value. The includes property
     * @param value Value to set for the includes property.
     * @return a void
     */
    public void setIncludes(@javax.annotation.Nullable final java.util.List<ServicePrincipalCreationConditionSet> value) {
        this._includes = value;
    }
    /**
     * Sets the isBuiltIn property value. The isBuiltIn property
     * @param value Value to set for the isBuiltIn property.
     * @return a void
     */
    public void setIsBuiltIn(@javax.annotation.Nullable final Boolean value) {
        this._isBuiltIn = value;
    }
}
