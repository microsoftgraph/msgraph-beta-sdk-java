package com.microsoft.graph.officeconfiguration.clientconfigurations.updatepriorities;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdatePrioritiesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The officeConfigurationPolicyIds property */
    private java.util.List<String> officeConfigurationPolicyIds;
    /** The officeConfigurationPriorities property */
    private java.util.List<Integer> officeConfigurationPriorities;
    /**
     * Instantiates a new updatePrioritiesPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdatePrioritiesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updatePrioritiesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdatePrioritiesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatePrioritiesPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("officeConfigurationPolicyIds", (n) -> { this.setOfficeConfigurationPolicyIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("officeConfigurationPriorities", (n) -> { this.setOfficeConfigurationPriorities(n.getCollectionOfPrimitiveValues(Integer.class)); });
        return deserializerMap;
    }
    /**
     * Gets the officeConfigurationPolicyIds property value. The officeConfigurationPolicyIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOfficeConfigurationPolicyIds() {
        return this.officeConfigurationPolicyIds;
    }
    /**
     * Gets the officeConfigurationPriorities property value. The officeConfigurationPriorities property
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getOfficeConfigurationPriorities() {
        return this.officeConfigurationPriorities;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("officeConfigurationPolicyIds", this.getOfficeConfigurationPolicyIds());
        writer.writeCollectionOfPrimitiveValues("officeConfigurationPriorities", this.getOfficeConfigurationPriorities());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the officeConfigurationPolicyIds property value. The officeConfigurationPolicyIds property
     * @param value Value to set for the officeConfigurationPolicyIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeConfigurationPolicyIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.officeConfigurationPolicyIds = value;
    }
    /**
     * Sets the officeConfigurationPriorities property value. The officeConfigurationPriorities property
     * @param value Value to set for the officeConfigurationPriorities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeConfigurationPriorities(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this.officeConfigurationPriorities = value;
    }
}
