package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Filter implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** *Experimental* Filter group set used to decide whether given object belongs and should be processed as part of this object mapping. An object is considered in scope if ANY of the groups in the collection is evaluated to true. */
    private java.util.List<FilterGroup> _categoryFilterGroups;
    /** Filter group set used to decide whether given object is in scope for provisioning. This is the filter which should be used in most cases. If an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is not satisfied any longer, such object will get de-provisioned'. An object is considered in scope if ANY of the groups in the collection is evaluated to true. */
    private java.util.List<FilterGroup> _groups;
    /** *Experimental* Filter group set used to filter out objects at the early stage of reading them from the directory. If an object doesn't satisfy this filter it will not be processed further. Important to understand is that if an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is no longer satisfied, such object will NOT get de-provisioned. An object is considered in scope if ANY of the groups in the collection is evaluated to true. */
    private java.util.List<FilterGroup> _inputFilterGroups;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new filter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Filter() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.filter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a filter
     */
    @javax.annotation.Nonnull
    public static Filter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Filter();
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
     * Gets the categoryFilterGroups property value. *Experimental* Filter group set used to decide whether given object belongs and should be processed as part of this object mapping. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @return a filterGroup
     */
    @javax.annotation.Nullable
    public java.util.List<FilterGroup> getCategoryFilterGroups() {
        return this._categoryFilterGroups;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Filter currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("categoryFilterGroups", (n) -> { currentObject.setCategoryFilterGroups(n.getCollectionOfObjectValues(FilterGroup::createFromDiscriminatorValue)); });
            this.put("groups", (n) -> { currentObject.setGroups(n.getCollectionOfObjectValues(FilterGroup::createFromDiscriminatorValue)); });
            this.put("inputFilterGroups", (n) -> { currentObject.setInputFilterGroups(n.getCollectionOfObjectValues(FilterGroup::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groups property value. Filter group set used to decide whether given object is in scope for provisioning. This is the filter which should be used in most cases. If an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is not satisfied any longer, such object will get de-provisioned'. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @return a filterGroup
     */
    @javax.annotation.Nullable
    public java.util.List<FilterGroup> getGroups() {
        return this._groups;
    }
    /**
     * Gets the inputFilterGroups property value. *Experimental* Filter group set used to filter out objects at the early stage of reading them from the directory. If an object doesn't satisfy this filter it will not be processed further. Important to understand is that if an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is no longer satisfied, such object will NOT get de-provisioned. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @return a filterGroup
     */
    @javax.annotation.Nullable
    public java.util.List<FilterGroup> getInputFilterGroups() {
        return this._inputFilterGroups;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("categoryFilterGroups", this.getCategoryFilterGroups());
        writer.writeCollectionOfObjectValues("groups", this.getGroups());
        writer.writeCollectionOfObjectValues("inputFilterGroups", this.getInputFilterGroups());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the categoryFilterGroups property value. *Experimental* Filter group set used to decide whether given object belongs and should be processed as part of this object mapping. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @param value Value to set for the categoryFilterGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryFilterGroups(@javax.annotation.Nullable final java.util.List<FilterGroup> value) {
        this._categoryFilterGroups = value;
    }
    /**
     * Sets the groups property value. Filter group set used to decide whether given object is in scope for provisioning. This is the filter which should be used in most cases. If an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is not satisfied any longer, such object will get de-provisioned'. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @param value Value to set for the groups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroups(@javax.annotation.Nullable final java.util.List<FilterGroup> value) {
        this._groups = value;
    }
    /**
     * Sets the inputFilterGroups property value. *Experimental* Filter group set used to filter out objects at the early stage of reading them from the directory. If an object doesn't satisfy this filter it will not be processed further. Important to understand is that if an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is no longer satisfied, such object will NOT get de-provisioned. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @param value Value to set for the inputFilterGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInputFilterGroups(@javax.annotation.Nullable final java.util.List<FilterGroup> value) {
        this._inputFilterGroups = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
