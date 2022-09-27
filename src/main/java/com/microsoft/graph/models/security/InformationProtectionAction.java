package com.microsoft.graph.models.security;

import com.microsoft.graph.models.security.AddContentFooterAction;
import com.microsoft.graph.models.security.AddContentHeaderAction;
import com.microsoft.graph.models.security.AddWatermarkAction;
import com.microsoft.graph.models.security.ApplyLabelAction;
import com.microsoft.graph.models.security.CustomAction;
import com.microsoft.graph.models.security.JustifyAction;
import com.microsoft.graph.models.security.MetadataAction;
import com.microsoft.graph.models.security.ProtectAdhocAction;
import com.microsoft.graph.models.security.ProtectByTemplateAction;
import com.microsoft.graph.models.security.ProtectDoNotForwardAction;
import com.microsoft.graph.models.security.RecommendLabelAction;
import com.microsoft.graph.models.security.RemoveContentFooterAction;
import com.microsoft.graph.models.security.RemoveContentHeaderAction;
import com.microsoft.graph.models.security.RemoveProtectionAction;
import com.microsoft.graph.models.security.RemoveWatermarkAction;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InformationProtectionAction implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new informationProtectionAction and sets the default values.
     * @return a void
     */
    public InformationProtectionAction() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.security.informationProtectionAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtectionAction
     */
    @javax.annotation.Nonnull
    public static InformationProtectionAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.addContentFooterAction": return new AddContentFooterAction();
                case "#microsoft.graph.security.addContentHeaderAction": return new AddContentHeaderAction();
                case "#microsoft.graph.security.addWatermarkAction": return new AddWatermarkAction();
                case "#microsoft.graph.security.applyLabelAction": return new ApplyLabelAction();
                case "#microsoft.graph.security.customAction": return new CustomAction();
                case "#microsoft.graph.security.justifyAction": return new JustifyAction();
                case "#microsoft.graph.security.metadataAction": return new MetadataAction();
                case "#microsoft.graph.security.protectAdhocAction": return new ProtectAdhocAction();
                case "#microsoft.graph.security.protectByTemplateAction": return new ProtectByTemplateAction();
                case "#microsoft.graph.security.protectDoNotForwardAction": return new ProtectDoNotForwardAction();
                case "#microsoft.graph.security.recommendLabelAction": return new RecommendLabelAction();
                case "#microsoft.graph.security.removeContentFooterAction": return new RemoveContentFooterAction();
                case "#microsoft.graph.security.removeContentHeaderAction": return new RemoveContentHeaderAction();
                case "#microsoft.graph.security.removeProtectionAction": return new RemoveProtectionAction();
                case "#microsoft.graph.security.removeWatermarkAction": return new RemoveWatermarkAction();
            }
        }
        return new InformationProtectionAction();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationProtectionAction currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
