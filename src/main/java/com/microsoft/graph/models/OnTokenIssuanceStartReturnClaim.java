package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnTokenIssuanceStartReturnClaim implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The claimIdInApiResponse property */
    private String _claimIdInApiResponse;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new onTokenIssuanceStartReturnClaim and sets the default values.
     * @return a void
     */
    public OnTokenIssuanceStartReturnClaim() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.onTokenIssuanceStartReturnClaim");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onTokenIssuanceStartReturnClaim
     */
    @javax.annotation.Nonnull
    public static OnTokenIssuanceStartReturnClaim createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnTokenIssuanceStartReturnClaim();
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
     * Gets the claimIdInApiResponse property value. The claimIdInApiResponse property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClaimIdInApiResponse() {
        return this._claimIdInApiResponse;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnTokenIssuanceStartReturnClaim currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("claimIdInApiResponse", (n) -> { currentObject.setClaimIdInApiResponse(n.getStringValue()); });
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
        writer.writeStringValue("claimIdInApiResponse", this.getClaimIdInApiResponse());
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
     * Sets the claimIdInApiResponse property value. The claimIdInApiResponse property
     * @param value Value to set for the claimIdInApiResponse property.
     * @return a void
     */
    public void setClaimIdInApiResponse(@javax.annotation.Nullable final String value) {
        this._claimIdInApiResponse = value;
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
