/*
 	Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 	
 	This file is part of OpenPnP.
 	
	OpenPnP is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    OpenPnP is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with OpenPnP.  If not, see <http://www.gnu.org/licenses/>.
 	
 	For more information about OpenPnP visit http://openpnp.org
 */

package org.openpnp.machine.reference.wizards;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.openpnp.gui.components.ComponentDecorators;
import org.openpnp.gui.components.LocationButtonsPanel;
import org.openpnp.gui.support.AbstractConfigurationWizard;
import org.openpnp.gui.support.LengthConverter;
import org.openpnp.gui.support.MutableLocationProxy;
import org.openpnp.machine.reference.ReferenceNozzleTip;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class ReferenceNozzleTipConfigurationWizard extends
        AbstractConfigurationWizard {
    private final ReferenceNozzleTip nozzleTip;
    private JPanel panelChanger;
    private JLabel lblX_1;
    private JLabel lblY_1;
    private JLabel lblZ_1;
    private LocationButtonsPanel locationButtonsPanel;
    private JLabel lblStartLocation;
    private JTextField textFieldChangerStartX;
    private JTextField textFieldChangerStartY;
    private JTextField textFieldChangerStartZ;
    private JLabel lblMiddleLocation;
    private JTextField textFieldChangerMidX;
    private JTextField textFieldChangerMidY;
    private JTextField textFieldChangerMidZ;
    private JLabel lblEndLocation;
    private JTextField textFieldChangerEndX;
    private JTextField textFieldChangerEndY;
    private JTextField textFieldChangerEndZ;
    private LocationButtonsPanel locationButtonsPanel_1;
    private LocationButtonsPanel locationButtonsPanel_2;

    public ReferenceNozzleTipConfigurationWizard(ReferenceNozzleTip nozzleTip) {
        this.nozzleTip = nozzleTip;
        
        panelChanger = new JPanel();
        panelChanger.setBorder(new TitledBorder(null, "Nozzle Tip Changer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contentPanel.add(panelChanger);
        panelChanger.setLayout(new FormLayout(new ColumnSpec[] {
                FormFactory.RELATED_GAP_COLSPEC,
                FormFactory.DEFAULT_COLSPEC,
                FormFactory.RELATED_GAP_COLSPEC,
                FormFactory.DEFAULT_COLSPEC,
                FormFactory.RELATED_GAP_COLSPEC,
                FormFactory.DEFAULT_COLSPEC,
                FormFactory.RELATED_GAP_COLSPEC,
                FormFactory.DEFAULT_COLSPEC,
                FormFactory.RELATED_GAP_COLSPEC,
                FormFactory.DEFAULT_COLSPEC,},
            new RowSpec[] {
                FormFactory.RELATED_GAP_ROWSPEC,
                FormFactory.DEFAULT_ROWSPEC,
                FormFactory.RELATED_GAP_ROWSPEC,
                FormFactory.DEFAULT_ROWSPEC,
                FormFactory.RELATED_GAP_ROWSPEC,
                FormFactory.DEFAULT_ROWSPEC,
                FormFactory.RELATED_GAP_ROWSPEC,
                FormFactory.DEFAULT_ROWSPEC,}));
        
        lblX_1 = new JLabel("X");
        panelChanger.add(lblX_1, "4, 2");
        
        lblY_1 = new JLabel("Y");
        panelChanger.add(lblY_1, "6, 2");
        
        lblZ_1 = new JLabel("Z");
        panelChanger.add(lblZ_1, "8, 2");
        
        lblStartLocation = new JLabel("Start Location");
        panelChanger.add(lblStartLocation, "2, 4, right, default");
        
        textFieldChangerStartX = new JTextField();
        panelChanger.add(textFieldChangerStartX, "4, 4, fill, default");
        textFieldChangerStartX.setColumns(5);
        
        textFieldChangerStartY = new JTextField();
        panelChanger.add(textFieldChangerStartY, "6, 4, fill, default");
        textFieldChangerStartY.setColumns(5);
        
        textFieldChangerStartZ = new JTextField();
        panelChanger.add(textFieldChangerStartZ, "8, 4, fill, default");
        textFieldChangerStartZ.setColumns(5);
        
        locationButtonsPanel = new LocationButtonsPanel((JTextField) null, (JTextField) null, (JTextField) null, (JTextField) null);
        panelChanger.add(locationButtonsPanel, "10, 4, fill, default");
        
        lblMiddleLocation = new JLabel("Middle Location");
        panelChanger.add(lblMiddleLocation, "2, 6, right, default");
        
        textFieldChangerMidX = new JTextField();
        panelChanger.add(textFieldChangerMidX, "4, 6, fill, default");
        textFieldChangerMidX.setColumns(5);
        
        textFieldChangerMidY = new JTextField();
        panelChanger.add(textFieldChangerMidY, "6, 6, fill, default");
        textFieldChangerMidY.setColumns(5);
        
        textFieldChangerMidZ = new JTextField();
        panelChanger.add(textFieldChangerMidZ, "8, 6, fill, default");
        textFieldChangerMidZ.setColumns(5);
        
        locationButtonsPanel_1 = new LocationButtonsPanel((JTextField) null, (JTextField) null, (JTextField) null, (JTextField) null);
        panelChanger.add(locationButtonsPanel_1, "10, 6, fill, default");
        
        lblEndLocation = new JLabel("End Location");
        panelChanger.add(lblEndLocation, "2, 8, right, default");
        
        textFieldChangerEndX = new JTextField();
        panelChanger.add(textFieldChangerEndX, "4, 8, fill, default");
        textFieldChangerEndX.setColumns(5);
        
        textFieldChangerEndY = new JTextField();
        panelChanger.add(textFieldChangerEndY, "6, 8, fill, default");
        textFieldChangerEndY.setColumns(5);
        
        textFieldChangerEndZ = new JTextField();
        panelChanger.add(textFieldChangerEndZ, "8, 8, fill, default");
        textFieldChangerEndZ.setColumns(5);
        
        locationButtonsPanel_2 = new LocationButtonsPanel((JTextField) null, (JTextField) null, (JTextField) null, (JTextField) null);
        panelChanger.add(locationButtonsPanel_2, "10, 8, fill, default");
    }

    @Override
    public void createBindings() {
        LengthConverter lengthConverter = new LengthConverter();

        MutableLocationProxy changerStartLocation = new MutableLocationProxy();
        bind(UpdateStrategy.READ_WRITE, nozzleTip, "changerStartLocation",
                changerStartLocation, "location");
        addWrappedBinding(changerStartLocation, "lengthX",
                textFieldChangerStartX, "text", lengthConverter);
        addWrappedBinding(changerStartLocation, "lengthY",
                textFieldChangerStartY, "text", lengthConverter);
        addWrappedBinding(changerStartLocation, "lengthZ",
                textFieldChangerStartZ, "text", lengthConverter);

        MutableLocationProxy changerMidLocation = new MutableLocationProxy();
        bind(UpdateStrategy.READ_WRITE, nozzleTip, "changerMidLocation",
                changerMidLocation, "location");
        addWrappedBinding(changerMidLocation, "lengthX",
                textFieldChangerMidX, "text", lengthConverter);
        addWrappedBinding(changerMidLocation, "lengthY",
                textFieldChangerMidY, "text", lengthConverter);
        addWrappedBinding(changerMidLocation, "lengthZ",
                textFieldChangerMidZ, "text", lengthConverter);

        MutableLocationProxy changerEndLocation = new MutableLocationProxy();
        bind(UpdateStrategy.READ_WRITE, nozzleTip, "changerEndLocation",
                changerEndLocation, "location");
        addWrappedBinding(changerEndLocation, "lengthX",
                textFieldChangerEndX, "text", lengthConverter);
        addWrappedBinding(changerEndLocation, "lengthY",
                textFieldChangerEndY, "text", lengthConverter);
        addWrappedBinding(changerEndLocation, "lengthZ",
                textFieldChangerEndZ, "text", lengthConverter);

        ComponentDecorators
            .decorateWithAutoSelectAndLengthConversion(textFieldChangerStartX);
        ComponentDecorators
            .decorateWithAutoSelectAndLengthConversion(textFieldChangerStartY);
        ComponentDecorators
            .decorateWithAutoSelectAndLengthConversion(textFieldChangerStartZ);

        ComponentDecorators
            .decorateWithAutoSelectAndLengthConversion(textFieldChangerMidX);
        ComponentDecorators
            .decorateWithAutoSelectAndLengthConversion(textFieldChangerMidY);
        ComponentDecorators
            .decorateWithAutoSelectAndLengthConversion(textFieldChangerMidZ);

        ComponentDecorators
            .decorateWithAutoSelectAndLengthConversion(textFieldChangerEndX);
        ComponentDecorators
            .decorateWithAutoSelectAndLengthConversion(textFieldChangerEndY);
        ComponentDecorators
            .decorateWithAutoSelectAndLengthConversion(textFieldChangerEndZ);

    }
}